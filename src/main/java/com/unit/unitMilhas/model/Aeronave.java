package com.unit.unitMilhas.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aeronave {
    private String prefixo;
    private String fabricante;
    private String modelo;
    private int nPassageiros;
    
    public Aeronave(){
        //Construtor vazio
    }

    public Aeronave(String prefixo, String fabricante, String modelo, int nPassageiros) {
        this.prefixo = prefixo;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.nPassageiros = nPassageiros;
    }

    @Id
    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getnPassageiros() {
        return nPassageiros;
    }

    public void setnPassageiros(int nPassageiros) {
        this.nPassageiros = nPassageiros;
    }
}




