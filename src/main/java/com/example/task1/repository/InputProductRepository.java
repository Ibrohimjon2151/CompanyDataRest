package com.example.task1.repository;


import com.example.task1.entity.InputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;
import java.util.UUID;
@RepositoryRestResource(collectionResourceRel = "list" , path = "inputProduct")
public interface InputProductRepository extends JpaRepository<InputProduct, UUID> {
}
