package com.example.task1.repository;

import com.example.task1.entity.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "list", path = "measurement")
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
