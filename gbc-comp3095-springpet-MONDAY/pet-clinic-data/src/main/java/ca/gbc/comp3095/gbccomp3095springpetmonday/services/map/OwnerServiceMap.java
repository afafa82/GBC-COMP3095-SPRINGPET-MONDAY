package ca.gbc.comp3095.gbccomp3095springpetmonday.services.map;

import ca.gbc.comp3095.gbccomp3095springpetmonday.model.Owner;
import ca.gbc.comp3095.gbccomp3095springpetmonday.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id){
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }
}
