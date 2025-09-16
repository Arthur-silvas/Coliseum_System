package com.coliseumgym.academiaSystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_setor")
public class SetorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome_responsavel;
    private String nome_setor;

    public SetorModel(){
            }

    public SetorModel(String nome_responsavel, String nome_setor) {
        this.nome_responsavel = nome_responsavel;
        this.nome_setor = nome_setor;
    }

    public String getNome_responsavel() {
        return nome_responsavel;
    }

    public void setNome_responsavel(String nome_responsavel) {
        this.nome_responsavel = nome_responsavel;
    }

    public String getNome_setor() {
        return nome_setor;
    }

    public void setNome_setor(String nome_setor) {
        this.nome_setor = nome_setor;
    }
}
