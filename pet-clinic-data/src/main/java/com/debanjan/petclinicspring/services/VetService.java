package com.debanjan.petclinicspring.services;


import com.debanjan.petclinicspring.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet owner);
    Set<Vet> findAll();
}
