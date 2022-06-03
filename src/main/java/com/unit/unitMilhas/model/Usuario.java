package com.unit.unitMilhas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {
    private Long id;
    //@NotBlank
    private String name;
    private String email;
    
    public Usuario(){

    }

    public Usuario(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    //Anotações do java, exemplo do Id: validar informações, trazer algo já definido.
    @Id
    @GeneratedValue

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
