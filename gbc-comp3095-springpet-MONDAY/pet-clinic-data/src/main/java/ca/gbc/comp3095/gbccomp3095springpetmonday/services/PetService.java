package ca.gbc.comp3095.gbccomp3095springpetmonday.services;

import ca.gbc.comp3095.gbccomp3095springpetmonday.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
