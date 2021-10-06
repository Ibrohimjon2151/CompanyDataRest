package com.example.task1.repository;


import com.example.task1.entity.Input;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;
@RepositoryRestResource(collectionResourceRel = "list" , path = "input")
public interface InputRepository extends JpaRepository<Input, UUID> {

}
