package com.example.task1.repository;


import com.example.task1.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(collectionResourceRel = "list" , path = "category")
public interface CategoryRepository extends JpaRepository<Category, Integer> {


}
