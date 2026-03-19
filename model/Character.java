package com.example.lolapi.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;

@Entity
@Table(name = "characters")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long characterId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    private String role;
    private String region;

    @OneToMany(mappedBy = "character", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Ability> abilities;

    public Character() {}

    public Long getCharacterId() { return characterId; }
    public void setCharacterId(Long characterId) { this.characterId = characterId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public List<Ability> getAbilities() { return abilities; }
    public void setAbilities(List<Ability> abilities) { this.abilities = abilities; }
}