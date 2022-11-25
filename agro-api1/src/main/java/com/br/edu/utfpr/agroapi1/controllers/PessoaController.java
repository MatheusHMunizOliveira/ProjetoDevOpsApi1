package com.br.edu.utfpr.agroapi1.controllers;

import java.util.List;

import com.br.edu.utfpr.agroapi1.model.Pessoa;
import com.br.edu.utfpr.agroapi1.repositories.PessoaRepository;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    //@Autowired
    private PessoaRepository repository;

    public PessoaController(PessoaRepository repository) {
        this.repository = repository;
    }

    // Metodos

    // getAll
    @GetMapping("/listarTodos")
    public ResponseEntity<List<Pessoa>> listar() {

        return ResponseEntity.ok(repository.findAll());
    }

    // Save
    @PostMapping("/salvar")
    public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa pessoa) {
        return ResponseEntity.ok(repository.save(pessoa));
    }

    // update
    @PutMapping
    public void alterar(@RequestBody Pessoa pessoa) {
        if (pessoa.getId() > 0) {
            repository.save(pessoa);
        }
    }

    // Delete
    @DeleteMapping
    public void excluir(@RequestBody Pessoa pessoa) {
        repository.delete(pessoa);
    }

    // fim metodos

}
