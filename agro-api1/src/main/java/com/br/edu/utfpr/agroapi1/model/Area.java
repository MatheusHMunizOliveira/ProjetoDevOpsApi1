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
    @Column(nullable = false)
    private Long idProprietario;
    private String cordenadaX;
    private String cordenadaY;
    
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
    public String getCordenadaX() {
        return cordenadaX;
    }
    public void setCordenadaX(String cordenadaX) {
        this.cordenadaX = cordenadaX;
    }
    public String getCordenadaY() {
        return cordenadaY;
    }
    public void setCordenadaY(String cordenadaY) {
        this.cordenadaY = cordenadaY;
    }
    public Long getIdProprietario() {
        return idProprietario;
    }
    public void setIdProprietario(Long idProprietario) {
        this.idProprietario = idProprietario;
    }
    
}
