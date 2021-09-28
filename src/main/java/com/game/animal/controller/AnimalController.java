package com.game.animal.controller;

import com.game.animal.domain.Animal;
import com.game.animal.domain.repositores.AnimalRepository;
import com.game.animal.form.AnimalForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/animal")
public class AnimalController {

    @Autowired
    private AnimalRepository animalRepository;

    @PostMapping
    public ResponseEntity salvar(@RequestBody AnimalForm animalForm) {

        Animal animal = new Animal();
        animal.setNome(animalForm.getNome());
        animal.setCaracteristica(animalForm.getCaracteristica());
        animal.setTerrestre(animalForm.getTerrestre());
        animal.setRefCaracteristica(animalForm.getRefCaracteristica());

        animalRepository.save(animal);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/listar/{opt}")
    public ResponseEntity<List<Animal>> listarAnimais(@PathVariable int opt) throws Exception {
        try {
            List<Animal> lista = animalRepository.listaDeAnimais(opt);
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/listar/relacionado/{ref}")
    public ResponseEntity<List<Animal>> listarAnimaisRelacionados(@PathVariable Long ref) throws Exception {
        try {
            List<Animal> lista = animalRepository.listaDeAnimaisRelacionados(ref);
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
