package com.example.trabalho_backend.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trabalho_backend.model.Filme;

public interface FilmeRepositorio extends JpaRepository<Filme, String> {
}
