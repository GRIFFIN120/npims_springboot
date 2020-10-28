package com.vala.info.entity;

import com.vala.base.entity.TreeEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@Data
@ToString(callSuper = true)
public class CategoryBean extends TreeEntity {
}
