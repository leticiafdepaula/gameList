
## GameList Descrição

O GameList é uma API desenvolvida em Java com Spring Boot para gerenciamento de listas de jogos. O sistema permite listar jogos, categorizá-los e organizá-los de acordo com preferências do usuário.

## Tecnologias Utilizadas

Java 17+

Spring Boot

Spring Data JPA (para interação com o banco de dados)

Hibernate

Banco de Dados H2/MySQL

Spring Web (para criação de APIs REST)

Swagger/OpenAPI (para documentação da API)

# Funcionalidades

📌 Listagem de jogos: Recupere todos os jogos cadastrados na base.

🔍 Busca por ID: Obtenha detalhes específicos de um jogo.

📝 Cadastro de novos jogos: Adicione novos jogos à sua lista.

✏️ Atualização de informações: Modifique detalhes de jogos cadastrados.

❌ Remoção de jogos: Exclua um jogo da base de dados.

## Como Executar o Projeto

1. Clonar o repositório

git clone https://github.com/leticiafdepaula/gameList.git
cd gameList

2. Configurar o banco de dados

Altere o arquivo application.properties para configurar o banco de dados desejado:

spring.datasource.url=jdbc:mysql://localhost:3306/gamelist
spring.datasource.username=root
spring.datasource.password=seu_password
spring.jpa.hibernate.ddl-auto=update

Caso esteja utilizando o H2 Database, mantenha a configuração padrão.

3. Construir e executar a aplicação

./mvnw spring-boot:run

A API estará acessível em http://localhost:8080.

## Endpoints Principais

| Método | Endpoint        | Descrição                       |
|--------|---------------|---------------------------------|
| GET    | `/games`       | Lista todos os jogos          |
| GET    | `/games/{id}`  | Retorna um jogo pelo ID       |
| POST   | `/games`       | Adiciona um novo jogo         |
| PUT    | `/games/{id}`  | Atualiza um jogo existente    |
| DELETE | `/games/{id}`  | Remove um jogo da lista       |


## Documentação da API

Após iniciar a aplicação, a documentação Swagger estará disponível em:

Swagger UI: http://localhost:8080/swagger-ui.html

OpenAPI JSON: http://localhost:8080/v3/api-docs
