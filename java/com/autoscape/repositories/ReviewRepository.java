package com.autoscape.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.autoscape.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{

}
