package ca.gbc.comp3095.gbccomp3095springpetmonday.services;

import ca.gbc.comp3095.gbccomp3095springpetmonday.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastname(String lastName);

}
