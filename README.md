# ☕ Java File Reader

Aplicação desenvolvida em Java para leitura e interpretação dinâmica de arquivos de texto (TXT).

O projeto permite carregar arquivos TXT locais ou disponibilizados através de uma URL, interpretar seus dados e organizá-los de forma dinâmica utilizando Collections, Generics e Stream API.

> 📄 **Formato suportado:** TXT

---

## 📌 Sobre o projeto

O Java File Reader foi criado como um projeto de prática para aplicar conceitos de Java em uma aplicação que trabalha com dados de diferentes estruturas.

A aplicação não depende de um modelo específico de dados. Os atributos são obtidos diretamente da primeira linha do arquivo, permitindo que diferentes conjuntos de informações sejam interpretados sem a necessidade de criar uma classe específica para cada tipo de registro.

Por exemplo, o mesmo leitor pode interpretar:

```
nome;idade;cidade
Ryan;19;Londrina
Lucas;24;Curitiba
```

ou:

```
produto;preco;categoria
Mouse;150;Periférico
Teclado;300;Periférico
```

sem alterar o código responsável pela interpretação.

---

## ⚙️ Funcionalidades

- 📄 Leitura de arquivos TXT locais
- 🌐 Leitura de arquivos TXT através de URL
- 🔄 Interpretação dinâmica dos atributos
- 📚 Utilização de Collections e Generics
- 🔀 Utilização da Stream API
- 🗂️ Organização dos registros utilizando `List<Map<String, String>>`
- 🖥️ Exibição dos dados de forma organizada

---

## 📄 Formato do arquivo

O arquivo deve ser um **TXT** e seguir um formato definido.

A primeira linha deve conter os nomes dos atributos, utilizando `;` como separador.

Cada linha seguinte representa um registro.

### Exemplo

```
id;nome;idade;cidade;linguagem
1;Ryan;19;Londrina;Java
2;Lucas;24;Curitiba;Python
3;Ana;22;Maringá;Java
```

O `;` é utilizado como delimitador entre os campos.

### Regras

Para que o arquivo seja interpretado corretamente:

1. O arquivo deve estar no formato TXT.
2. A primeira linha deve conter os atributos.
3. Os atributos devem ser separados por `;`.
4. Cada registro deve estar em uma nova linha.
5. A quantidade de valores deve corresponder à quantidade de atributos.

---

## 🗂️ Estrutura dos dados

Após a leitura, os registros são representados utilizando:

```
List<Map<String, String>>
```

Por exemplo:

```
{id=1, nome=Ryan, idade=19, cidade=Londrina, linguagem=Java}
{id=2, nome=Lucas, idade=24, cidade=Curitiba, linguagem=Python}
```

Cada `Map` representa um registro, enquanto:

- A chave representa o nome do atributo.
- O valor representa o dado correspondente.

Essa abordagem permite trabalhar com uma quantidade variável de atributos sem precisar definir previamente uma classe para representar os dados.

---

## 🌐 Leitura através de URL

Além de arquivos locais, o projeto permite fornecer uma URL contendo o conteúdo do arquivo TXT.

Exemplo:

```
https://exemplo.com/arquivo.txt
```

A aplicação realiza uma requisição HTTP, obtém o conteúdo e o envia para o mesmo processo de interpretação utilizado nos arquivos locais.

Dessa forma, independentemente da origem do arquivo, o resultado final mantém a mesma estrutura.

---

## 🖥️ Exemplo de execução

Ao iniciar a aplicação:

```
====== JAVA FILE READER ======
Como deseja fornecer o arquivo?
1 - Arquivo local
2 - URL
Insira sua opção:
```

Após fornecer o arquivo, os dados são apresentados de forma organizada:

```
========== INFORMAÇÕES ==========

---------------------------------
id: 1
nome: Ryan
idade: 19
cidade: Londrina
linguagem: Java

---------------------------------
id: 2
nome: Lucas
idade: 24
cidade: Curitiba
linguagem: Python

=================================
```

---

## 📁 Estrutura do projeto

```
java-file-reader/
├── data/
│   └── infos
├── src/
│   ├── fileReader/
│   │   ├── LeitorArquivo.java
│   │   └── LeitorTXT.java
│   ├── source/
│   │   └── FonteURL.java
│   └── Main.java
└── README.md
```

---

## 🛠️ Tecnologias e conceitos

### Linguagem

- Java

### Principais recursos utilizados

- Java Collections
- Generics
- Stream API
- `List`
- `Map`
- `LinkedHashMap`
- `Files`
- `Path`
- `HttpClient`
- `HttpRequest`
- `HttpResponse`

---

## 🎯 Objetivo

O principal objetivo do projeto é colocar em prática conceitos de Java e desenvolvimento de software, explorando principalmente Collections, Generics, Stream API, manipulação de arquivos e comunicação HTTP.