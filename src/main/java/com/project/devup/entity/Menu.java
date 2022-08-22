package com.project.devup.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Menu {
    @Id
    private String menuId;

    private String menuName;
    private String menuUrl;
    private int depth;
    private String pMenuId;
    private String useYn;
    private String authId;
}
