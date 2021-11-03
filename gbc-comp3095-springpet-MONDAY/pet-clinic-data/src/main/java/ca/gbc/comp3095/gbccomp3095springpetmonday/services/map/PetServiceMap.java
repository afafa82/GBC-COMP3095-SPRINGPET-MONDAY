package ca.gbc.comp3095.gbccomp3095springpetmonday.services.map;

import ca.gbc.comp3095.gbccomp3095springpetmonday.model.Pet;
import ca.gbc.comp3095.gbccomp3095springpetmonday.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet save(Pet pet) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Pet object) {

    }

    @Override
    public Pet findById(Long id) {
        return null;
    }
}
