# Projeto modulo 3 Spring Boot

## Spring Framework
Conjunto de bibliotecas escritas em Java para simplificar o desenvolvimento de aplicaçoes WEB 

## Spring Boot
Ferramenta para acelerar o inicio de um projeto utilizando o spring Framework 
- https://spring.io/projects/spring-boot
- Start: https://start.spring.io/
Site que cria a estrutura de um projeto utilizando o Spring Boot

## Configuraçao do ambiente
- Java Development kit (JDK)
- Maven (gerenciador de pacotes e ferramenta de build)
- VScode
  - Extension Pack for Java (Microsoft)
  - Extension Pack for Spring Boot (Pivotal)
- Banco de dados (MariaDB)

## Passo a passo para criar um novo projeto Springboot no VScode
- Criar uma pasta no disco do computador
- Abrir a pasta no VScode usando a opçao File (arquivo) -> Open Folder (abrir pasta)
- Ctrl + shift + p
- Digitar spring
- Selecionar Spring Initializr: create a Maven project
- Qual a versao do Spring Framework (a ultima versao)
- Qual a linguagem: Java
- Qual o pacote base do projeto: dominio da empresa( univille.br) usar invertido (br.univille)
- Qual o nome do projeto: (nao usar espaco ou caracter especial)
- Qual a forma de empacotamento: JAR 
- Qual a versao do JDK: 11 ( depende da versao instalada no seu computador)
- Quais sao as dependenciais do projeto:
  - Spring Web (clicar para selecionar)
  - Spring Boot DevTools (clicar para selecionar)
  - Thymeleaf (clicar e selecionar)
- Clicar em Selected N dependencies
- Selecionar a pasta onde o projeto sera criado (usar a mesma que foi utilizada no passo 1)
- Retorno que o projeto foi criado com sucesso, clicar em open

## Como adicionar uma nova dependencia no projeto
- Opçao 1
- Ctrl + shift + P
- Spring Initializr: Add Starters
- Digito o nome da dependencia: exemplo Thymeleaf
- Clicar sobre o nome da dependencia desejada
- Clicar sobre Selected N dependencies
- Clicar Proceed
- Salvar o arquivo POM
- "A build file was modifield. Do you want to synchronize de java classpath?" Always (SEMPRE)

- Opçao 2
- Acessar o site https://mvnrepository.com/
- Procurar pela dependencia desejada: ex bootstrap / jquery
- Listar versoes e voce seleciona a versao desejada 
- O site sugere o XML necessario para incluir a dependencia, entao copie o XML
- Volta no projeto, abre o arquivo POM.xml
- Procura a TAG <dependencies>
- Dentro do corpo da tag, colar o XML copiado do site
- Salvar o arquivo

## Configuração para conexão no banco de dados relacional
- Adicionar dependências (Spring Data JPA, H2, MariaDB JDBC Driver)
- Configurar a conexão da aplicação com o banco de dados no arquivo application.properties


## Estrutura do projeto
- Pacote src: todo o codigo da aplicaçao (Java, HTML, CSS, JS)
- Pacote target: codigo compilado e gerado pelo Maven
- Arquivo pom.xml: arquivo descritor utilizado pelo Maven para
download das dependencias e build de aplicaçao
- Application.java - main da aplicação Java
- Pacote controller: classes que são responsáveis por tratar as requisições HTTP enviadas para as rotas definidas por anotação

## Executar a aplicaçao
- Encontrar o Spring Boot Dashboard
- Clicar no icone de Play do lado do nome do projeto