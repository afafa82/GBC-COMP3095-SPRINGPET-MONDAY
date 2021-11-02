package ca.gbc.comp3095.gbccomp3095springpetmonday.services;

import ca.gbc.comp3095.gbccomp3095springpetmonday.model.Owner;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<Owner> findAll();
    T findById(ID id);
    T save(Owner owner);

    void delete(T object);
    void deleteById(ID id);

}
