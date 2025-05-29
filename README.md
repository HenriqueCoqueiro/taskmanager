
# 📝 Task Manager API

API RESTful para gerenciamento de tarefas com autenticação JWT. Projeto criado para fins de prática com **Spring Security** e **JWT**, utilizando **PostgreSQL** no ambiente principal e **H2** como banco de testes.

---

## 🚀 Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Maven
- Spring Data JPA
- PostgreSQL (produção)
- H2 Database (testes)

---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com o objetivo de **praticar a implementação de segurança via JWT** em aplicações Spring Boot, além de consolidar conceitos de autenticação, controle de acesso e manipulação de entidades via API RESTful.

---

## 🔐 Autenticação

A autenticação usa token JWT. É necessário se registrar e, em seguida, fazer login para obter um token.

### 🔸 Registro de usuário

`POST /auth/register`

```json
{
  "login": "usuario123",
  "password": "senha123",
  "role": "USER"
}
````

### 🔸 Login

`POST /auth/login`

```json
{
  "login": "usuario123",
  "password": "senha123"
}
```

**Resposta:**

```json
{
  "token": "Bearer <seu_token_aqui>"
}
```

---

## 📌 Endpoints de Tarefas

🔐 Todos os endpoints exigem token JWT no cabeçalho:

```
Authorization: Bearer <seu_token>
```

### 🔹 Listar tarefas

`GET /tasks`

**Resposta:**

```json
[
  {
    "id": 1,
    "title": "Estudar Spring",
    "description": "JWT + Security"
  },
  ...
]
```

### 🔹 Criar nova tarefa

`POST /tasks`

```json
{
  "title": "Nova tarefa",
  "description": "Descrição da tarefa"
}
```

---

## ⚙️ Como rodar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/seuusuario/taskmanager.git
cd taskmanager
```

2. Configure o banco de dados no `application.properties`:

Para **PostgreSQL**:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/taskdb
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

Para **H2 (testes)**:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.h2.console.enabled=true
```

3. Compile e execute:

```bash
./mvnw clean install
./mvnw spring-boot:run
```

---

## 🗂️ Estrutura do Projeto

```
src/
├── controller/
├── dto/
├── entities/
├── repositories/
├── services/
└── infra/security/
```

---

## ✍️ Autor

Henrique Coqueiro de Melo
Projeto com fins educacionais
