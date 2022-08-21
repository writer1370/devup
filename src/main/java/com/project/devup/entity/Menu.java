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
    private String MENU_ID;

    private String MENU_NAME;
    private String MENU_URL;
    private int DEPTH;
    private String P_MENU_ID;
    private String USE_YN;
    private String AUTH_ID;
}
