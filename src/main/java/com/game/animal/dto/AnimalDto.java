package com.game.animal.dto;

import com.game.animal.domain.Animal;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AnimalDto {

    private Long id;
    private String nome;
    private String caracteristica;
    private Long refCaracteristica;
    private int terrestre;

    public AnimalDto() { }

    public AnimalDto(Animal animal) {
        this.id = animal.getId();
        this.nome = animal.getNome();
        this.caracteristica = animal.getCaracteristica();
        this.refCaracteristica = animal.getRefCaracteristica();
        this.terrestre = animal.getTerrestre();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalDto animalDto = (AnimalDto) o;
        return terrestre == animalDto.terrestre && Objects.equals(id, animalDto.id) && Objects.equals(nome, animalDto.nome) && Objects.equals(caracteristica, animalDto.caracteristica) && Objects.equals(refCaracteristica, animalDto.refCaracteristica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, caracteristica, refCaracteristica, terrestre);
    }
}
