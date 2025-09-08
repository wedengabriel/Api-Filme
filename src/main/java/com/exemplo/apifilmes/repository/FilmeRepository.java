package com.exemplo.apifilmes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exemplo.apifilmes.model.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
