package com.example.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(name = "nome")
private String nome;

@Column(name = "email")
private String email;

@Column(name = "senha")
private String senha;
}
