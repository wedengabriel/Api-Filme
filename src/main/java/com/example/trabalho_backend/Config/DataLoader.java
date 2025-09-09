package com.example.trabalho_backend.Config;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.trabalho_backend.model.Filme;
import com.example.trabalho_backend.repositorio.FilmeRepositorio;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(FilmeRepositorio filmeRepositorio) {
        return args -> {
            if (filmeRepositorio.count() == 0) {
                Filme filme1 = new Filme();
                filme1.setId(UUID.randomUUID().toString());
                filme1.setNome("Matrix");
                filme1.setAtor("Keanu Reeves");
                filme1.setGenero("Ficção Científica");
                filmeRepositorio.save(filme1);

                Filme filme2 = new Filme();
                filme2.setId(UUID.randomUUID().toString());
                filme2.setNome("O Poderoso Chefão");
                filme2.setAtor("Marlon Brando");
                filme2.setGenero("Crime");
                filmeRepositorio.save(filme2);

                Filme filme3 = new Filme();
                filme3.setId(UUID.randomUUID().toString());
                filme3.setNome("Titanic");
                filme3.setAtor("Leonardo DiCaprio");
                filme3.setGenero("Romance");
                filmeRepositorio.save(filme3);

                System.out.println("Filmes carregados no banco!");
            }
        };
    }
}
