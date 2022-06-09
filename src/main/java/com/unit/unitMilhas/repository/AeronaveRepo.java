package com.unit.unitMilhas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.unit.unitMilhas.model.Aeronave;

public interface AeronaveRepo extends JpaRepository<Aeronave, Long>{
    
}
