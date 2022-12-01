package com.br.edu.utfpr.agroapi1.services;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.br.edu.utfpr.agroapi1.data.DetalhePessoaData;
import com.br.edu.utfpr.agroapi1.model.Pessoa;
import com.br.edu.utfpr.agroapi1.repositories.PessoaRepository;

@Component
public class DetalhePessoaServiceImpl implements UserDetailsService {

    private final PessoaRepository repository;

    public DetalhePessoaServiceImpl(PessoaRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        Optional<Pessoa> pessoa = repository.findByEmail(username);
        if(pessoa.isEmpty()){
            throw new UsernameNotFoundException("Email [" + username + "] não encontrado");
        }
        
        return new DetalhePessoaData(pessoa);
    }
    
}
