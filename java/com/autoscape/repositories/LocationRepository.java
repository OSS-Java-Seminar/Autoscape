package com.autoscape.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.autoscape.entities.Location;
public interface LocationRepository extends JpaRepository<Location, Long>{

}
