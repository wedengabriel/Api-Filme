package com.example.trabalho_backend.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.trabalho_backend.model.Filme;
import com.example.trabalho_backend.repositorio.FilmeRepositorio;

@RestController
@RequestMapping("Filmes")
public class FilmeController {
    private FilmeRepositorio FilmeRepositorio;

    public FilmeController(FilmeRepositorio FilmeRepositorio) {
        this.FilmeRepositorio = FilmeRepositorio;
    }

    @PostMapping
    public void salvar(@RequestBody Filme Filmes){
        String id = UUID.randomUUID().toString();
        Filmes.setId(id);
        FilmeRepositorio.save(Filmes);
        System.out.println("Filme" + Filmes);
    }

    @GetMapping("/{id}")
    public Filme obterPorId(@PathVariable("id") String id) {
        return FilmeRepositorio.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") String id){
        FilmeRepositorio.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable("id") String id, @RequestBody Filme Filmes){
        Filmes.setId(id);
        FilmeRepositorio.save(Filmes);
    }

    public FilmeRepositorio getFilmeRepositorio() {
        return FilmeRepositorio;
    }
}
