package com.autoscape.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autoscape.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
}
