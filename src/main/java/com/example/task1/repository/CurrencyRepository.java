package com.example.task1.repository;


import com.example.task1.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "list" , path = "currency")
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
}
