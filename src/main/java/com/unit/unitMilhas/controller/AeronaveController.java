package com.unit.unitMilhas.controller;

import com.unit.unitMilhas.model.Aeronave;
import com.unit.unitMilhas.repository.AeronaveRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value="/airplanes")
public class AeronaveController {
    @Autowired // Conexão com o repositório
    private AeronaveRepo airplaneRepo;

    @GetMapping //Listar aeronaves
    public List<Aeronave> findAll(){
        return airplaneRepo.findAll();
    }

    @PostMapping
    public Aeronave save(@RequestBody Aeronave novaAeronave){ //Corpo da requisição
        return airplaneRepo.save(novaAeronave);
    }

    @PutMapping
    public Aeronave update(@RequestBody Aeronave aeronaveAtualizar){
        return airplaneRepo.save(aeronaveAtualizar);
    }

    @DeleteMapping
    public String delete(@RequestBody Aeronave aeronaveDeletar){
        airplaneRepo.delete(aeronaveDeletar);
        return "Aeronave deletada com sucesso!";
    }
}

/*
 Usando cliente Thunder:
    localhost:8080/airplanes

    Vá para as abas "Body" e sub-aba "Json"
    Body > Json

    Corpo para testes(Modelo):
    {
        "prefixo": "PT-101",
        "fabricante": "Embraer;
        "modelo": "195";
        "nPassageiros": 146;
    }
 */
