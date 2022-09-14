package br.com.throchadev.projetogerenciamentodepessoas.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PESSOA")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 50)
    private String identificador;

    @Column(nullable = false, length = 4)
    private String tipoIdentificador;
}
