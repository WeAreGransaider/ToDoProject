package com.example.demo.Enity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "role")
@EqualsAndHashCode
public class RoleUser {

    private String personRole;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public RoleUser(){}

    public RoleUser(String personRole) {
        this.personRole = personRole;
    }
}
