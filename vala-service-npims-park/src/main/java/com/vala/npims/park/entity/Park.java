package com.vala.npims.park.entity;

import com.vala.base.entity.BaseEntity;
import com.vala.base.entity.FileColumn;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@Data
@ToString
public class Park extends BaseEntity {

    @FileColumn(type="txt")
    public String path;

    public Integer styleId;
}
