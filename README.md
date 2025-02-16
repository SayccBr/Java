# 📌 Aprendendo Java - Exemplos Práticos

Este repositório contém diversos exemplos de programas em **Java** para aprendizado e prática de conceitos fundamentais de programação orientada a objetos, manipulação de dados e interação com o usuário.

---

## 📂 Estrutura dos Arquivos

A pasta **aprendendojava** contém os seguintes arquivos:

### 📌 1. Sistema de Biblioteca
Um sistema simples para gerenciar **livros**, **usuários** e **empréstimos** de livros em uma biblioteca.

- **`Livro.java`**  
  - Classe que representa um livro, com atributos como título, autor, ISBN e disponibilidade.
  - Métodos para emprestar e devolver livros.

- **`Usuario.java`**  
  - Representa um usuário da biblioteca, armazenando seu nome e ID.
  - Permite que o usuário empreste e devolva livros.

- **`Biblioteca.java`**  
  - Gerencia uma coleção de livros e usuários.
  - Permite adicionar/remover livros, registrar usuários e controlar empréstimos e devoluções.

- **`SistemaBiblioteca.java`**  
  - Interface de menu interativa para manipular a biblioteca via **console**.
  - Permite que o usuário interaja com a biblioteca adicionando livros, registrando usuários, emprestando e devolvendo livros.

---

### 📌 2. Sistema de Reserva de Assentos no Cinema
Um programa que permite a reserva de assentos em um cinema utilizando **matrizes**.

- **`Cinema.java`**  
  - Permite visualizar os assentos disponíveis e fazer reservas.
  - Implementa um menu interativo onde os usuários podem reservar lugares ou visualizar a disposição dos assentos.

---

### 📌 3. Algoritmo de Ordenação (Insertion Sort)
Demonstra a implementação do algoritmo **Insertion Sort** para ordenar um vetor de números.

- **`InsertionSort.java`**  
  - O usuário insere um array de números e o programa os ordena usando **Insertion Sort**.
  - O resultado é exibido no console antes e depois da ordenação.

---

## 🚀 Como Executar os Programas

1. **Baixe e extraia os arquivos**.
2. **Compile e execute** os arquivos `.java` usando um **IDE** (como IntelliJ, Eclipse, NetBeans) ou pelo terminal usando `javac` e `java`.

   **Exemplo via terminal:**
   ```sh
   javac SistemaBiblioteca.java
   java SistemaBiblioteca
