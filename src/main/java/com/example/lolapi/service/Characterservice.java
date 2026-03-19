package com.example.lolapi.service;

import com.example.lolapi.model.Character;
import com.example.lolapi.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }

    public Optional<Character> getCharacterById(Long id) {
        return characterRepository.findById(id);
    }

    public Character addCharacter(Character character) {
        if (character.getAbilities() != null) {
            character.getAbilities().forEach(ability -> ability.setCharacter(character));
        }
        return characterRepository.save(character);
    }

    public Character updateCharacter(Long id, Character character) {
        character.setCharacterId(id);
        if (character.getAbilities() != null) {
            character.getAbilities().forEach(ability -> ability.setCharacter(character));
        }
        return characterRepository.save(character);
    }

    public void deleteCharacter(Long id) {
        characterRepository.deleteById(id);
    }

    public List<Character> getByRole(String role) {
        return characterRepository.findByRole(role);
    }

    public List<Character> getByRegion(String region) {
        return characterRepository.findByRegion(region);
    }

    public List<Character> getByName(String name) {
        return characterRepository.findByNameContainingIgnoreCase(name);
    }
}