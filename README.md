# API simples feita com Spring Boot 🍃 + PostgreSQL 🐘
### Desenvolvida durante o curso de Spring Boot do canal "amigoscode" 📚

#### Como executar a API:
1. Com o Java (17), PostgreSQL e sua IDE de preferência já previamente instalados, abra o projeto e execute o arquivo "DemoApplication.java"
<p>  1.1. Configure o acesso ao banco de dados. Caso a senha e o usuário do PostgreSQL em sua máquina sejam diferentes da <em>default</em>, abra a pasta "resources", vá em "application.properties" e altere os campos <strong>username</strong> e <strong>password</strong>.</p>

   `spring.datasource.username=postgres`
   <p></p>
   
   `spring.datasource.password=postgres`


2. Acesse a URL https://localhost8080/api e você verá um JSON com 2 nomes pré-inseridos no banco.
![JSON com nomes de teste](https://github.com/marcosvcg/marcosvcg/blob/main/images/json_com_nomes.png "JSON com nomes de teste")


3. Envie requisições para testar a API.
    
   3.1 GET para visualizar os dados:
![exemplo de uma requisição GET](https://github.com/marcosvcg/marcosvcg/blob/main/images/get_request.png "exemplo de uma requisição GET")

   3.2. POST para adicionar usuários no banco de dados:
![exemplo de uma requisição POST](https://github.com/marcosvcg/marcosvcg/blob/main/images/post_request.png "exemplo de uma requisição POST")

   3.3 PUT para atualizar os dados de um usuário:
![exemplo de uma requisição PUT](https://github.com/marcosvcg/marcosvcg/blob/main/images/put_request.png "exemplo de uma requisição PUT")

   3.4 DELETE para remover um usuário:
![exemplo de uma requisição DELETE](https://github.com/marcosvcg/marcosvcg/blob/main/images/delete_request.png "exemplo de uma requisição DELETE")

#### (Obs: se preferir, você pode inserir, atualizar e remover os usuários pelo próprio PostgreSQL que os dados serão mostrados pela API)
