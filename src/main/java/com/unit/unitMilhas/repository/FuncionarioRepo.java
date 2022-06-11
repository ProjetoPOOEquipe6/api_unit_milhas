package com.unit.unitMilhas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.unit.unitMilhas.model.Funcionario;

public interface FuncionarioRepo extends JpaRepository<Funcionario, Long> { 

}
