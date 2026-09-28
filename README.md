# 📦 Sistema de Estoque em Java

Projeto desenvolvido para **estudo e fixação dos fundamentos de Java e Programação Orientada a Objetos (POO)**.

O projeto consiste em um sistema de gerenciamento de estoque executado pelo console, desenvolvido de forma incremental para colocar em prática os conceitos estudados durante o aprendizado de Java.

> ✅ **Projeto concluído — versão Java + POO pelo console.**

## 🎯 Objetivo

Praticar conceitos fundamentais de Java e POO através da construção de um sistema de estoque funcional, trabalhando com cadastro, gerenciamento, alteração e controle de produtos e suas quantidades em estoque.

## ⚙️ Funcionalidades

### 📦 Gerenciamento de produtos

* [x] Cadastrar produtos
* [x] Listar produtos cadastrados
* [x] Buscar produto por ID
* [x] Alterar informações do produto
* [x] Excluir produto
* [x] Exibir detalhes completos do produto

### 📊 Gerenciamento de estoque

* [x] Adicionar quantidade ao estoque
* [x] Remover quantidade do estoque
* [x] Validar quantidade adicionada
* [x] Validar quantidade removida
* [x] Impedir remoção maior que o estoque disponível
* [x] Permitir cancelamento da remoção através da quantidade `0`

### 📈 Consultas e relatórios

* [x] Calcular preço total do estoque
* [x] Identificar produtos com estoque baixo
* [x] Gerar relatório do estoque

## 📋 Informações armazenadas

Cada produto possui:

* **ID**
* **Nome**
* **Departamento**
* **Categoria**
* **Valor**
* **Quantidade em estoque**

## 🛠️ Tecnologias

* **Java**
* **ArrayList**
* **Scanner**
* **Programação Orientada a Objetos (POO)**

## 📚 Conceitos praticados

Durante o desenvolvimento foram praticados conceitos como:

* Classes e objetos
* Construtores
* Encapsulamento
* Atributos `private`
* Getters e setters
* Métodos
* Parâmetros
* `ArrayList`
* `for-each`
* Estruturas condicionais
* Estruturas de repetição
* `switch`
* Entrada de dados com `Scanner`
* Tipos primitivos e `String`
* `static`
* Tratamento de exceções
* `try/catch`
* `InputMismatchException`
* `IllegalArgumentException`
* Validação de dados
* Regras de negócio

## 📁 Estrutura do projeto

```text
Sistema-estoque-java-POO/
│
├── src/
│   ├── App.java
│   ├── Estoque.java
│   └── Produto.java
│
├── .gitignore
└── README.md
```

## ▶️ Como executar

### Pré-requisitos

É necessário ter o **Java (JDK)** instalado.

### Execução

Clone o repositório:

```bash
git clone https://github.com/BrayanMatheus/Sistema-estoque-java-POO.git
```

Entre na pasta do projeto:

```bash
cd Sistema-estoque-java-POO
```

Compile e execute o projeto utilizando sua IDE ou ambiente Java de preferência.

## 🧩 Próxima etapa

A versão atual do projeto tem como objetivo consolidar os conhecimentos de **Java e POO utilizando o console e estruturas em memória**.

A próxima evolução planejada é adicionar **persistência de dados utilizando banco de dados**, substituindo gradualmente o armazenamento em `ArrayList` por dados persistidos.

## 📌 Sobre o projeto

Este projeto foi desenvolvido como **projeto de estudo**, com foco em transformar os conceitos aprendidos em Java e POO em uma aplicação prática.

A versão atual representa a conclusão da etapa de **Java + POO pelo console**. A partir dela, o projeto poderá evoluir para uma aplicação com persistência de dados e novos conceitos de desenvolvimento.
