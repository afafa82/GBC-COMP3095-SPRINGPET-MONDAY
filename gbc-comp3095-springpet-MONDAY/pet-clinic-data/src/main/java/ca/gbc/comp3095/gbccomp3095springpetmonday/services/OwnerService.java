package ca.gbc.comp3095.gbccomp3095springpetmonday.services;

import ca.gbc.comp3095.gbccomp3095springpetmonday.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastname(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
