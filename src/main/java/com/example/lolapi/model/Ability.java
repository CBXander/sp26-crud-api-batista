package com.example.lolapi.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "abilities")
public class Ability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long abilityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @ManyToOne
    @JoinColumn(name = "character_id", nullable = false)
    @JsonBackReference
    private Character character;

    public Ability() {}

    public Long getAbilityId() { return abilityId; }
    public void setAbilityId(Long abilityId) { this.abilityId = abilityId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Character getCharacter() { return character; }
    public void setCharacter(Character character) { this.character = character; }
}