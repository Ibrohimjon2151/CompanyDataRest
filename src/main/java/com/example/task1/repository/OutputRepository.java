package com.example.task1.repository;


import com.example.task1.entity.Output;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;
@RepositoryRestResource(collectionResourceRel = "list" , path = "output")
public interface OutputRepository extends JpaRepository<Output, UUID> {
}
