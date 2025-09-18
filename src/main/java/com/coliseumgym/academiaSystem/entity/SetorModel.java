package com.coliseumgym.academiaSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_setor")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SetorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome_responsavel;

    private String nome_setor;

    @OneToMany
    @JoinColumn(name = "cadastros_id")
    private UserModel userModel;

}
