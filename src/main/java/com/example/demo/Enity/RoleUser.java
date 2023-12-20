package com.example.demo.Enity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "role")
@EqualsAndHashCode
public class RoleUser{

    private String personRole;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public RoleUser(){}

    public RoleUser(String personRole) {
        this.personRole = personRole;
    }
}
