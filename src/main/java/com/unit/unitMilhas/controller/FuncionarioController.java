package com.unit.unitMilhas.controller;

import java.util.List;

import com.unit.unitMilhas.model.Funcionario;
import com.unit.unitMilhas.repository.FuncionarioRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
    /*
    Usando cliente Thunder:
    localhost:8080//employee

    Vá para as abas "Body" e sub-aba "Json"
    Body > Json
  
    Corpo para testes(Modelo):
    {
      "id": 1,
      "name": "Rafael Vieira",
      "cpf": "0123456789",
      "identidade": "1111111",
      "orgaoEmissor": "SDSPE",
      "telefone": "55-81-99999-8888",
      "dataNascimento": "01/04/1980",
      "email": "rafaelvieira@google.com",
      "matricula": 123,
      "dataMatricula": "11/06/2022",
      "funcao": "GERENTE"
    }
    funcao: RECEPCIONISTA CONSULTOR GERENTE DIRETOR
    */
    
    
}