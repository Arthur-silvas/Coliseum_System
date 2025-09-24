package com.coliseumgym.academiaSystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_cadastro")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    private String name;
    private String password;

    @ManyToOne
    @JoinColumn(name = "setor_id")
    private SetorModel setorModel;
}
