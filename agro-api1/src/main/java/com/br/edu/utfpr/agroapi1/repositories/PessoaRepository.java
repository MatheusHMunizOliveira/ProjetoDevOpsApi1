package com.br.edu.utfpr.agroapi1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.br.edu.utfpr.agroapi1.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
}
