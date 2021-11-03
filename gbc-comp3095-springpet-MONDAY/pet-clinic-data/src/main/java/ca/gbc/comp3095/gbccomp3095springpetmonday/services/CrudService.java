package ca.gbc.comp3095.gbccomp3095springpetmonday.services;

import ca.gbc.comp3095.gbccomp3095springpetmonday.model.Owner;
import ca.gbc.comp3095.gbccomp3095springpetmonday.model.Pet;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();
    T findById(ID id);
    T save(T object);

    void delete(T object);
    void deleteById(ID id);

}
