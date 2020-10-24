package com.debanjan.petclinicspring.services.map;

import com.debanjan.petclinicspring.model.Pet;
import com.debanjan.petclinicspring.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Pet save(Pet Pet) {
        return super.save(Pet.getId(),Pet);
    }

    @Override
    public void delete(Pet Pet) {
        super.delete(Pet);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
