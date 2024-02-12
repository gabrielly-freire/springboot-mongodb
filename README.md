# Projeto MongoDB com Spring Boot

Este é um projeto prático desenvolvido como parte do curso "Programação Orientada a Objetos com Java", ministrado pelo Prof. Dr. Nelio Alves. 
O objetivo desta seção é explorar e implementar conceitos relacionados ao uso do banco de dados MongoDB aliado ao framework Spring Boot.

## Objetivos gerais do projeto

1. **Paradigma Orientado a Documentos e Relacional:** Compreensão das principais diferenças entre bancos de dados orientados a documentos, como o MongoDB, e bancos de dados relacionais. Isso inclui a compreensão do modelo de dados, a flexibilidade do esquema e as vantagens do paradigma orientado a documentos.
2. **Implementar o CRUD (Create, Read, Update, Delete):** Implementação das operações básicas de manipulação de dados em um banco de dados MongoDB, utilizando o Spring Boot.
3. **Decisões de Design para Banco de Dados Orientado a Documentos:** Reflexão sobre as melhores práticas e decisões de design ao trabalhar com bancos de dados orientados a documentos. Isso incluirá a discussão sobre a estruturação de documentos, o uso de índices e a otimização de consultas.
4. **Associações entre Objetos:**
    - **Objetos Aninhados:** Implementação de associações entre objetos por meio de objetos aninhados no MongoDB. Isso permitirá aos participantes entender como modelar relacionamentos complexos dentro de um único documento.
    - **Referências:** Exploração do uso de referências para estabelecer associações entre documentos no MongoDB. Os participantes aprenderão a criar e gerenciar referências eficientes entre entidades.
5. **Consultas com Spring Data e MongoRepository:** Exploração de consultas eficientes utilizando o Spring Data e a interface MongoRepository. E a implementação de consultas personalizadas.

## Como executar este projeto

É requisito ter um ambiente de desenvolvimento configurado com o Java e o Spring Boot. 
Além disso, é necessário ter um servidor MongoDB em execução localmente e configurar as propriedades de conexão no arquivo `application.properties`.

### Configuração do Ambiente

1. Faça o clone deste repositório: `git clone git@github.com:gabrielly-freire/springboot-mongodb.git`
2. Importe o projeto em sua IDE preferida.
3. Certifique-se de ter um servidor MongoDB em execução localmente e se está devidamente configurada as propriedades de conexão no arquivo `application.properties`.

### Executando o projeto

Execute a aplicação Spring Boot e acesse os endpoints definidos para realizar operações CRUD.

## Tecnologias utilizadas
- Java
- Spring Boot
- MongoDB
- Maven
- Imsomnia (utilizado para testar os endpoints, pode ser substituído por Postman)