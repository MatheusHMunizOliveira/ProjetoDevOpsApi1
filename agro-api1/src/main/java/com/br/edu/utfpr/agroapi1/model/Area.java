package com.br.edu.utfpr.agroapi1.model;

// import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String tipoPropriedade;
    @Column(nullable = false)
    private String endereco;

    // private List<Ponto> poligonoArea;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipoPropriedade() {
        return tipoPropriedade;
    }
    public void setTipoPropriedade(String tipoPropriedade) {
        this.tipoPropriedade = tipoPropriedade;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    // public List<Ponto> getPoligonoArea() {
    //     return poligonoArea;
    // }
    // public void setPoligonoArea(List<Ponto> poligonoArea) {
    //     this.poligonoArea = poligonoArea;
    // }
}
