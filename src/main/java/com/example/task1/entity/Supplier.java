package com.example.task1.entity;

import com.example.task1.entity.template.AbsNameEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Supplier extends AbsNameEntity {
    private String phoneNumber;

}
