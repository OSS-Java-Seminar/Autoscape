package com.autoscape.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.autoscape.entities.Receipt;

public interface ReceiptRepository extends JpaRepository<Receipt, Long>{

}
