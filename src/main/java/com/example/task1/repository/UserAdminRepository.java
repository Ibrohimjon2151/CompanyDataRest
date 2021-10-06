package com.example.task1.repository;


import com.example.task1.entity.UserAdmin;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(collectionResourceRel = "list" ,path = "user")
public interface UserAdminRepository extends JpaRepository<UserAdmin, Integer> {

}
