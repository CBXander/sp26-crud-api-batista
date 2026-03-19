package com.example.lolapi.controller;

import com.example.lolapi.model.Character;
import com.example.lolapi.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/characters")
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @GetMapping
    public List<Character> getAllCharacters() {
        return characterService.getAllCharacters();
    }

    @GetMapping("/{id}")
    public Optional<Character> getCharacterById(@PathVariable Long id) {
        return characterService.getCharacterById(id);
    }

    @PostMapping
    public Character addCharacter(@RequestBody Character character) {
        return characterService.addCharacter(character);
    }

    @PutMapping("/{id}")
    public Character updateCharacter(@PathVariable Long id, @RequestBody Character character) {
        return characterService.updateCharacter(id, character);
    }

    @DeleteMapping("/{id}")
    public String deleteCharacter(@PathVariable Long id) {
        characterService.deleteCharacter(id);
        return "Character " + id + " deleted.";
    }

    @GetMapping("/role/{role}")
    public List<Character> getByRole(@PathVariable String role) {
        return characterService.getByRole(role);
    }

    @GetMapping("/region/{region}")
    public List<Character> getByRegion(@PathVariable String region) {
        return characterService.getByRegion(region);
    }

    @GetMapping("/search")
    public List<Character> searchByName(@RequestParam String name) {
        return characterService.getByName(name);
    }
}