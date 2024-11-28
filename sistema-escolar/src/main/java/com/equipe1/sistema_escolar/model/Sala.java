package com.equipe1.sistema_escolar.model;

import jakarta.persistence.*;

@Entity
@Table (name = "tb_sala")
public class Sala {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column (name = "pk_id_sala")
        private Long id;

        @Column (name = "name_sala")
        private String nome;

        @Column (name = "capacidade")
        private int capacidade;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
