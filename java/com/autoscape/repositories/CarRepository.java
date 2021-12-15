package com.autoscape.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.autoscape.entities.Car;
public interface CarRepository extends JpaRepository<Car, Long>{

}
