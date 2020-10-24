package com.debanjan.petclinicspring.services.map;

import com.debanjan.petclinicspring.model.Vet;
import com.debanjan.petclinicspring.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Vet save(Vet Vet) {
        return super.save(Vet.getId(),Vet);
    }

    @Override
    public void delete(Vet Vet) {
        super.delete(Vet);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
