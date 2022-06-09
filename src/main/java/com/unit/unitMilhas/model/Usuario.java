package com.unit.unitMilhas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {
    private Long id;
    //@NotBlank
    private String name;
    private String cpf;
    private String identidade;
    private String orgaoEmissor;
    private String telefone;
    private String dataNascimento;
    private String email;

    public Usuario(){
        //Construtor vazio
    }

    public Usuario(Long id, String name, String cpf, String identidade, String orgaoEmissor, String telefone,
            String dataNascimento, String email) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.identidade = identidade;
        this.orgaoEmissor = orgaoEmissor;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }   
}
