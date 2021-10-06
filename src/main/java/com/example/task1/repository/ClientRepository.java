package com.example.task1.repository;


import com.example.task1.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "list" , path = "client")
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
