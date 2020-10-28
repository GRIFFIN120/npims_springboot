package com.vala.user.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.vala.base.convertor.EntityListSerializer;
import com.vala.base.entity.BaseEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@ToString(callSuper = true)
public class RoleBasic extends BaseEntity {


    @JsonSerialize(using = EntityListSerializer.ListSerializer.class)
    @JsonDeserialize(using = EntityListSerializer.ListDeserializer.class)
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="role_menu",
            joinColumns={@JoinColumn(name="role_id")},inverseJoinColumns={@JoinColumn(name="menu_id")}
    )
    public List<MenuItem> menus;


}
