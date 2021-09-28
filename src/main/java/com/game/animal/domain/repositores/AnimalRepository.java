package com.game.animal.domain.repositores;

import com.game.animal.domain.Animal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Long> {

    @Query("SELECT a FROM Animal a WHERE a.terrestre = ?1")
    ArrayList<Animal> listaDeAnimais(int terrestre);

    @Query("SELECT a FROM Animal a WHERE a.refCaracteristica = ?1")
    ArrayList<Animal> listaDeAnimaisRelacionados(Long terrestre);
}
