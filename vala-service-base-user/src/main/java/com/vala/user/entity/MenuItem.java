package com.vala.user.entity;

import com.vala.base.entity.TreeEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class MenuItem extends TreeEntity {
    private String icon;
    private String path;
}
