package com.unit.unitMilhas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unit.unitMilhas.model.TipoFuncao;
import com.unit.unitMilhas.repository.TipoFuncaoRepo;

@RestController
@RequestMapping(value="/function")
public class TipoFuncaoController {
    @Autowired
    private TipoFuncaoRepo functionRepo;

    @GetMapping
    public List<TipoFuncao> findAll(){
        return functionRepo.findAll();
    }

    @PostMapping 
    public TipoFuncao save(@RequestBody TipoFuncao novaTipoFuncao){
        return functionRepo.save(novaTipoFuncao);
    }

    @PutMapping
    public TipoFuncao update(@RequestBody TipoFuncao TipoFuncaoAtualizar){
        return functionRepo.save(TipoFuncaoAtualizar);
    }

    @DeleteMapping
    public String delete(@RequestBody TipoFuncao TipoFuncaoDeletar){
        return "Tipo função deletada com sucesso!";
    }


    
}
