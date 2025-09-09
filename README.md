# Trabalho Backend - API de Filmes

Este projeto é uma API RESTful em **Spring Boot** para gerenciamento de filmes. Ele permite cadastrar, listar, atualizar e deletar filmes com atributos como **id**, **nome**, **ator** e **gênero**.

---

## Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database (ou qualquer outro banco configurado)
- Maven

---

## Estrutura do Projeto

```
src/main/java/com/example/trabalho_backend
├── controller
│   └── FilmeController.java
├── model
│   └── Filme.java
├── repositorio
│   └── FilmeRepositorio.java
└── config
    └── DataLoader.java
```

---

## Endpoints

A base da API é: `http://localhost:8080/Filmes`

| Método | Rota               | Descrição                        |
|--------|------------------|----------------------------------|
| GET    | /Filmes           | Lista todos os filmes            |
| GET    | /Filmes/{id}      | Retorna um filme por ID          |
| POST   | /Filmes           | Cadastra um novo filme           |
| PUT    | /Filmes/{id}      | Atualiza um filme existente      |
| DELETE | /Filmes/{id}      | Deleta um filme por ID           |

**Exemplo de JSON para POST/PUT:**
```json
{
  "nome": "Vingadores",
  "ator": "Robert Downey Jr.",
  "genero": "Ação"
}
```

---

## Exemplos de Retorno

**GET /Filmes**
```json
[
  {
    "id": "123e4567-e89b-12d3-a456-426614174000",
    "nome": "Vingadores",
    "ator": "Robert Downey Jr.",
    "genero": "Ação"
  }
]
```

**GET /Filmes/{id}**
```json
{
  "id": "123e4567-e89b-12d3-a456-426614174000",
  "nome": "Vingadores",
  "ator": "Robert Downey Jr.",
  "genero": "Ação"
}
```

---

## Como Executar

1. Clone o repositório:
```bash
git clone <url-do-repositorio>
```

2. Acesse o diretório do projeto:
```bash
cd trabalho_backend
```

3. Compile e rode a aplicação com Maven:
```bash
mvn spring-boot:run
```

4. Acesse a API em:
```
http://localhost:8080/Filmes
```

---

## Observações

- O banco de dados usado é em memória (H2) por padrão. Todos os dados serão perdidos ao reiniciar a aplicação.
- Certifique-se de que as pastas e pacotes estejam corretos para evitar erros de `package not found`.
- Para popular dados iniciais, utilize o `DataLoader.java` ou faça requisições POST via Postman ou Insomnia.

---

## Autor

Weden Gabriel da Silva Gomes
RU: 4170826
...
