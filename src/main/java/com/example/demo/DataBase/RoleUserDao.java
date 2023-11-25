package com.example.demo.DataBase;

import com.example.demo.Enity.RoleUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleUserDao extends JpaRepository<RoleUser,Long> {

    RoleUser getById(Long id);

}
