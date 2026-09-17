# ☕ Java File Reader

Aplicação desenvolvida em Java para leitura e interpretação dinâmica de arquivos de texto.

O projeto permite carregar arquivos TXT locais ou disponibilizados através de uma URL, interpretar seus dados e organizá-los de forma dinâmica utilizando Collections, Generics e Stream API.

> 🚧 **Status:** Em desenvolvimento <br>
> 📄 **Formato suportado atualmente:** TXT

---

## 📌 Sobre o projeto

O Java File Reader foi criado como um projeto de prática para aplicar conceitos de Java em uma aplicação que trabalha com dados de diferentes estruturas.

A aplicação não depende de um modelo específico de dados. Os atributos são obtidos diretamente da primeira linha do arquivo, permitindo que diferentes conjuntos de informações sejam interpretados sem a necessidade de criar uma classe específica para cada tipo de registro.

Por exemplo, o mesmo leitor pode interpretar:

```text
nome;idade;cidade
Ryan;19;Londrina
Lucas;24;Curitiba
```

ou:

```text
produto;preco;categoria
Mouse;150;Periférico
Teclado;300;Periférico
```

sem alterar o código responsável pela interpretação.

---

## ⚙️ Funcionalidades

Atualmente, o projeto permite:

* 📄 Leitura de arquivos TXT locais
* 🌐 Leitura de arquivos TXT através de URL
* 🔄 Interpretação dinâmica dos atributos
* 📚 Utilização de Collections e Generics
* 🔀 Utilização da Stream API
* 🗂️ Organização dos registros utilizando `List<Map<String, String>>`
* 🖥️ Exibição dos dados de forma organizada

---

## 📄 Formato do arquivo

O arquivo deve ser um **TXT** e seguir um formato definido.

A primeira linha deve conter os nomes dos atributos, utilizando `;` como separador.

Cada linha seguinte representa um registro.

### Exemplo

```text
id;nome;idade;cidade;linguagem
1;Ryan;19;Londrina;Java
2;Lucas;24;Curitiba;Python
3;Ana;22;Maringá;Java
```

O `;` é utilizado como delimitador entre os campos.

### Regras atuais

Para que o arquivo seja interpretado corretamente:

1. O arquivo deve estar no formato TXT.
2. A primeira linha deve conter os atributos.
3. Os atributos devem ser separados por `;`.
4. Cada registro deve estar em uma nova linha.
5. A quantidade de valores deve corresponder à quantidade de atributos.

---

## 🗂️ Estrutura dos dados

Após a leitura, os registros são representados utilizando:

```java
List<Map<String, String>>
```

Por exemplo:

```text
{id=1, nome=Ryan, idade=19, cidade=Londrina, linguagem=Java}
{id=2, nome=Lucas, idade=24, cidade=Curitiba, linguagem=Python}
```

Cada `Map` representa um registro, enquanto:

* A chave representa o nome do atributo.
* O valor representa o dado correspondente.

Essa abordagem permite trabalhar com uma quantidade variável de atributos sem precisar definir previamente uma classe para representar os dados.

---

## 🌐 Leitura através de URL

Além de arquivos locais, o projeto permite fornecer uma URL contendo o conteúdo do arquivo TXT.

Exemplo:

```text
https://exemplo.com/arquivo.txt
```

A aplicação realiza uma requisição HTTP, obtém o conteúdo e o envia para o mesmo processo de interpretação utilizado nos arquivos locais.

Dessa forma, independentemente da origem do arquivo, o resultado final mantém a mesma estrutura.

---

## 🖥️ Exemplo de execução

Ao iniciar a aplicação:

```text
====== JAVA FILE READER ======
Como deseja fornecer o arquivo?
1 - Arquivo local
2 - URL
Insira sua opção:
```

Após fornecer o arquivo, os dados são apresentados de forma organizada:

```text
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

```text
java-file-reader/
├── data/
│   └── infos
├── src/
│   ├── fileReader/
│   │   ├── LeitorArquivo.java
│   │   ├── LeitorCSV.java
│   │   ├── LeitorTXT.java
│   │   └── LeitorXML.java
│   ├── source/
│   │   └── FonteURL.java
│   └── Main.java
└── README.md
```

> Alguns componentes estão presentes na estrutura do projeto como parte da evolução planejada, mas atualmente apenas a leitura de TXT está implementada.

---

## 🛠️ Tecnologias e conceitos

### Linguagem

* Java

### Principais recursos utilizados

* Java Collections
* Generics
* Stream API
* `List`
* `Map`
* `LinkedHashMap`
* `Files`
* `Path`
* `HttpClient`
* `HttpRequest`
* `HttpResponse`

---

## 🚧 Próximos passos

O projeto continuará sendo desenvolvido conforme novos conceitos forem estudados.

Planejamento:

* [ ] Tratamento de exceções
* [ ] Validação dos dados de entrada
* [ ] Suporte para arquivos CSV
* [ ] Suporte para arquivos XML
* [ ] Melhorias na apresentação dos dados
* [ ] Outras funcionalidades relacionadas à leitura e manipulação de arquivos

---

## 🎯 Objetivo

O principal objetivo do projeto é colocar em prática conceitos de Java e desenvolvimento de software, explorando principalmente Collections, Generics, Stream API, manipulação de arquivos e comunicação HTTP.

O projeto será evoluído gradualmente conforme novos conhecimentos forem adquiridos.
