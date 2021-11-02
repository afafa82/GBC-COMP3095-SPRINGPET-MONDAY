package ca.gbc.comp3095.gbccomp3095springpetmonday.services;

import ca.gbc.comp3095.gbccomp3095springpetmonday.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
