package com.br.edu.utfpr.agroapi1.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.edu.utfpr.agroapi1.model.Area;
import com.br.edu.utfpr.agroapi1.repositories.AreaRepository;


@RestController
@RequestMapping("/area")
public class AreaController {
    
    private AreaRepository repository;

// Metodos

    // getAll
    @GetMapping
    public List<Area> listar() {
        return repository.findAll();
    }

    // Save
    @PostMapping
    public void salvar(@RequestBody Area area) {
        repository.save(area);
    }

    // update
    @PutMapping
    public void alterar(@RequestBody Area area) {
        if (area.getId() > 0) {
            repository.save(area);
        }
    }

    // Delete
    @DeleteMapping
    public void excluir(@RequestBody Area area) {
        repository.delete(area);
    }

    // fim metodos
}
