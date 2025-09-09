package com.example.trabalho_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Filmes")

public class Filme {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "Ator")
    private String Ator;
    @Column(name = "genero")
    private String genero;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtor() {
        return Ator;
    }

    public void setAtor(String Ator) {
        this.Ator = Ator;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", Ator='" + Ator + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
