package com.vala.info.entity;

import com.vala.base.entity.BaseEntity;
import com.vala.base.entity.FileColumn;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@Data
@ToString(callSuper = true)
public class ArticleBean extends BaseEntity {

    @FileColumn
    public String path;

}
