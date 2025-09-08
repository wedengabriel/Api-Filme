package com.exemplo.apifilmes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import com.exemplo.apifilmes.model.Filme;
import com.exemplo.apifilmes.repository.FilmeRepository;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeRepository repository;

    @GetMapping
    public List<Filme> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Filme> buscarPorId(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PostMapping
    public Filme adicionar(@RequestBody Filme filme) {
        return repository.save(filme);
    }

    @PutMapping("/{id}")
    public Filme atualizar(@PathVariable Long id, @RequestBody Filme filme) {
        filme.setId(id);
        return repository.save(filme);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
