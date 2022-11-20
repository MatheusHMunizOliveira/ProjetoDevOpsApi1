package br.edu.utfpr.tac.agroapi1.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO {
    private String nome;
    private String email;
    private String senha;
    private LocalDate nascimento;
}