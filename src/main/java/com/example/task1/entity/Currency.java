package com.example.task1.entity;

import com.example.task1.entity.template.AbsNameEntity;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@Entity
@EqualsAndHashCode(callSuper = true)
public class Currency extends AbsNameEntity {

}
