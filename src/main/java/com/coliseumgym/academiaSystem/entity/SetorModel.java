package com.coliseumgym.academiaSystem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_setor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SetorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome_responsavel;
    private String nome_setor;

    @OneToMany(mappedBy = "setorModel")
    private List<UserModel> userModel;
}
