package com.example.task1.repository;


import com.example.task1.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "list" , path = "supplier")
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
