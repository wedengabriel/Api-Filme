
# 🎬 API de Filmes (Spring Boot)

Esta é uma API simples desenvolvida em **Java com Spring Boot** para gerenciar um catálogo de filmes.  
Ela permite **listar, adicionar, atualizar e excluir filmes** com validação de dados.

---

## ✅ **Funcionalidades**
- **GET /filmes** → lista todos os filmes.
- **GET /filmes/{id}** → busca um filme pelo ID.
- **POST /filmes** → adiciona um novo filme (com validação).
- **PUT /filmes/{id}** → atualiza um filme existente.
- **DELETE /filmes/{id}** → remove um filme pelo ID.

---

## ✅ **Validações Implementadas**
- `titulo` → obrigatório.
- `ano` → deve ser maior que 1900.
- `nota` → deve ser entre 0 e 10.

Se os dados forem inválidos, a API retorna **400 Bad Request** com mensagens de erro.

---

## ✅ **Tecnologias Utilizadas**
- **Java 17**
- **Spring Boot 3**
- **Maven**
- **Lombok** (para reduzir código boilerplate)
- **Spring Validation**

---

## ✅ **Como Rodar o Projeto**

### **1. Pré-requisitos**
- Java 17+
- Maven instalado
- IDE (IntelliJ, Eclipse, VSCode) ou terminal

### **2. Clonar o repositório**
```bash
git clone https://github.com/seu-usuario/api-filmes.git
cd api-filmes
```

### **3. Rodar o projeto**
Usando Maven:
```bash
mvn spring-boot:run
```

Ou gerando um JAR:
```bash
mvn clean package
java -jar target/api-filmes-1.0.0.jar
```

A API estará disponível em:
```
http://localhost:8080
```

---

## ✅ **Rotas Disponíveis**

### **1. Listar todos os filmes**
```
GET /filmes
```
**Exemplo de Resposta:**
```json
[
  {
    "id": 1,
    "titulo": "O Senhor dos Anéis",
    "ano": 2001,
    "nota": 9.5
  }
]
```

---

### **2. Buscar filme por ID**
```
GET /filmes/{id}
```
**Exemplo:**
```
GET /filmes/1
```
**Resposta:**
```json
{
  "id": 1,
  "titulo": "O Senhor dos Anéis",
  "ano": 2001,
  "nota": 9.5
}
```

---

### **3. Adicionar novo filme**
```
POST /filmes
Content-Type: application/json
```
**Exemplo de Corpo:**
```json
{
  "titulo": "O Senhor dos Anéis",
  "ano": 2001,
  "nota": 9.5
}
```
**Resposta (201 Created):**
```json
{
  "id": 1,
  "titulo": "O Senhor dos Anéis",
  "ano": 2001,
  "nota": 9.5
}
```

---

### **4. Atualizar filme**
```
PUT /filmes/{id}
Content-Type: application/json
```
**Exemplo de Corpo:**
```json
{
  "titulo": "O Senhor dos Anéis: A Sociedade do Anel",
  "ano": 2001,
  "nota": 9.7
}
```
**Resposta (200 OK):**
```json
{
  "id": 1,
  "titulo": "O Senhor dos Anéis: A Sociedade do Anel",
  "ano": 2001,
  "nota": 9.7
}
```

---

### **5. Remover filme**
```
DELETE /filmes/{id}
```
**Resposta (204 No Content):**
Sem corpo na resposta.

---

## ✅ **Códigos de Status**
- **200 OK** → sucesso em requisições GET, PUT.
- **201 Created** → item criado com sucesso (POST).
- **204 No Content** → item excluído (DELETE).
- **400 Bad Request** → erro de validação.
- **404 Not Found** → recurso não encontrado.

---

## ✅ **Testando com cURL**
**Adicionar filme:**
```bash
curl -X POST http://localhost:8080/filmes -H "Content-Type: application/json" -d '{"titulo":"Matrix","ano":1999,"nota":9.0}'
```

**Listar filmes:**
```bash
curl http://localhost:8080/filmes
```

---

## ✅ **Testando com Postman**
1. Abra o Postman.
2. Crie uma requisição para `http://localhost:8080/filmes`.
3. Teste cada rota com os exemplos acima.

---

## ✅ **Próximos Passos**
- Adicionar banco de dados (H2, MySQL, etc.).
- Adicionar paginação e filtros.
- Criar testes automatizados.

---
