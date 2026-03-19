package com.example.lolapi.repository;

import com.example.lolapi.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {

    List<Character> findByRole(String role);
    List<Character> findByRegion(String region);
    List<Character> findByNameContainingIgnoreCase(String name);
}