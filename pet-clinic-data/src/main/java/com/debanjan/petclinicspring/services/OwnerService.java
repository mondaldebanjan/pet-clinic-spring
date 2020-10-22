package com.debanjan.petclinicspring.services;


import com.debanjan.petclinicspring.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

}
