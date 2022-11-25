package com.br.edu.utfpr.agroapi1.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.br.edu.utfpr.agroapi1.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
    public Optional<Pessoa> findByEmail(String email);

}
