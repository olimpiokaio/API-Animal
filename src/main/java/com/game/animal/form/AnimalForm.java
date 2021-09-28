package com.game.animal.form;

public class AnimalForm {

    private Long id;
    private String nome;
    private String caracteristica;
    private Long refCaracteristica;
    private int terrestre;

    public AnimalForm() {
    }

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

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public Long getRefCaracteristica() {
        return refCaracteristica;
    }

    public void setRefCaracteristica(Long refCaracteristica) {
        this.refCaracteristica = refCaracteristica;
    }

    public int getTerrestre() {
        return terrestre;
    }

    public void setTerrestre(int terrestre) {
        this.terrestre = terrestre;
    }
}
