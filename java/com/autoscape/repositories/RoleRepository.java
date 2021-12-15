package com.autoscape.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.autoscape.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
