package com.unit.unitMilhas.controller;

import java.util.List;

import com.unit.unitMilhas.model.Usuario;
import com.unit.unitMilhas.repository.UsuarioRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UsuarioController {
   
    // Conexão com o repositório
    @Autowired
    private UsuarioRepo userRepo;

    @GetMapping //l Listar os usuarios
    public List<Usuario> findAll(){
        return userRepo.findAll();
    }

    @PostMapping
    public Usuario save(@RequestBody Usuario novoUsuario){ // Corpo da requisição
        return userRepo.save(novoUsuario);
    }

    @PutMapping 
    public Usuario update(@RequestBody Usuario usuarioAtualizar){
        return userRepo.save(usuarioAtualizar);
    }

    @DeleteMapping
    public String delete(@RequestBody Usuario usuarioDeletar){
        userRepo.delete(usuarioDeletar);
        return "Usuário deletado com sucesso!";
        
    }
}
