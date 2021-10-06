package com.example.task1.entity;

import com.example.task1.entity.template.AbsNameEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Client extends AbsNameEntity {
    private String phoneNumber;
}
