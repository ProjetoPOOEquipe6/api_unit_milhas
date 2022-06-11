package com.unit.unitMilhas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unit.unitMilhas.model.Funcionario;
import com.unit.unitMilhas.repository.FuncionarioRepo;


@RestController
@RequestMapping(value="/employee") 
public class FuncionarioController {
    @Autowired

    private FuncionarioRepo employeeRepo;

    @GetMapping
    public List<Funcionario> findAll(){
        return employeeRepo.findAll();
    }

    @PostMapping
    public Funcionario save(@RequestBody Funcionario novoFuncionario){
        return employeeRepo.save(novoFuncionario);
    }
    

    @PutMapping
    public Funcionario update(@RequestBody Funcionario funcionarioAtualizar){
        return employeeRepo.save(funcionarioAtualizar);
    }

    @DeleteMapping
    public String delete(@RequestBody Funcionario funcionarioDeletar){
        employeeRepo.delete(funcionarioDeletar);
        return "Funcionario deletado com sucesso!";
    }

    
    
}
