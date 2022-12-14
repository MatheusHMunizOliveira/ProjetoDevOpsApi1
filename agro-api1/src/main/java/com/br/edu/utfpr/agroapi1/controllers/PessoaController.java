package com.br.edu.utfpr.agroapi1.controllers;

import java.util.List;
import java.util.Optional;

import com.br.edu.utfpr.agroapi1.model.Pessoa;
import com.br.edu.utfpr.agroapi1.repositories.PessoaRepository;

import org.springframework.http.HttpStatus;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    //@Autowired
    private PessoaRepository repository;
    private PasswordEncoder encoder;

    public PessoaController(PessoaRepository repository, PasswordEncoder encoder) {
        this.repository = repository;
        this.encoder = encoder;
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
        pessoa.setSenha(encoder.encode(pessoa.getSenha()));
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

    @GetMapping("/validarSenha")
    public ResponseEntity<Boolean> validarSenha(@RequestParam String email, @RequestParam String senha){

       
        boolean valid = false;
        // Verfica se o usuario existe
        Optional<Pessoa> opPessoa = repository.findByEmail(email);
        if (opPessoa.isEmpty()){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(valid);
        }
        //Verifica se a senha informada condiz com o usuario
        valid = encoder.matches(senha, opPessoa.get().getSenha());
        //se a senha for valida vai atribuir status OK se nao NaoAutorizado
        HttpStatus status = valid ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;

        return ResponseEntity.status(status).body(valid);
    }

    // fim metodos

}
