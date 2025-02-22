# Sistema de Gerenciamento de Biblioteca

Este é um projeto simples de gerenciamento de biblioteca desenvolvido em Java. O sistema permite que os usuários gerenciem livros e usuários, além de realizar operações de empréstimo e devolução de livros. Este projeto foi criado para praticar conceitos de Programação Orientada a Objetos (POO) e o uso de `ArrayList`.

## Funcionalidades

- Adicionar livros à biblioteca.
- Adicionar usuários ao sistema.
- Emprestar livros para usuários.
- Devolver livros.
- Listar livros disponíveis e emprestados.
- Listar usuários registrados.

## Tecnologias Utilizadas

- Java
- ArrayList (para gerenciamento de listas de livros e usuários)

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- **Pessoa**: Classe abstrata que representa uma pessoa (base para `Usuario`).
- **Usuario**: Classe que representa um usuário da biblioteca.
- **Livro**: Classe que representa um livro na biblioteca.
- **Biblioteca**: Classe que gerencia a coleção de livros e usuários, além das operações de empréstimo e devolução.

## Como Usar

1. Clone o repositório:
   ```bash
   git clone https://github.com/cleberjesus2/sistema-gerenciamento-de-bibiloteca.git

2. Navegue até o diretório do projeto:
   ```bash
   cd NOME_DO_REPOSITORIO

3. Compile e execute o programa:
```bash
   javac BibliotecaMain.java
   java BibliotecaMain
