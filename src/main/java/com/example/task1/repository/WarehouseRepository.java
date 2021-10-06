package com.example.task1.repository;


import com.example.task1.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "list" ,path = "warehouse")
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
}
