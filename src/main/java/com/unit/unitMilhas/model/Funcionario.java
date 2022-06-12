package com.unit.unitMilhas.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;


@Entity
public class Funcionario extends Usuario {
    private int matricula;
    private String dataMatricula;
    //Coloca o tipo de enum (String ou ordinal) e traz o nome da classe que foi criada o enum
    @Enumerated(value = EnumType.STRING)
    private TipoFuncao funcao;
    
    public Funcionario(){   
    }

    public Funcionario(int matricula, String dataMatricula, TipoFuncao funcao) {
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
        this.funcao = funcao;
    }

    
    @GeneratedValue

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public TipoFuncao getFuncao() {
        return funcao;
    }

    public void setFuncao(TipoFuncao funcao) {
        this.funcao = funcao;
    }


}

