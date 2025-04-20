<h1>Desafio 3 - Crud de Clientes</h1>


Plataforma: DevSuperior <br />
Curso: Spring Professional <br />
Módulo: API REST, camadas, CRUD, exceções, validações <br />
Status: Finalizado <br />

# 👩🏼‍💻Sobre

Repositório criado com a finalidade de entregar a proposta de solução do desafio do módulo "API REST, camadas, CRUD, exceções, validações" do curso [Java Spring Professional](https://devsuperior.com.br/curso-java-spring-professional) ministrado pelo professor Nélio Alves e disponível na plataforma DevSuperior.

# 🤖Tecnologias

* Java 21
* Maven 4.0.0
* Spring Boot 3.4.4
* Spring Tool Suíte 4
* Postman

## 📄Check-list

- [x] Busca por id
- [x] Busca por id inexistente retorna erro 404
- [x] Lista de clientes paginada
- [x] Inserção de cliente
- [x] Inserção de cliente com dados inválidos retorna erro 422 e mensagens customizadas
- [x] Atualização de dados de cliente cadastrado
- [x] Tentativa de atualização de cliente inexistente retorna 404
- [x] Tentativa de atualização de cliente com dados inválidos retorna 422 e mensagens customizadas
- [x] Deleção de cliente
- [x] Tentativa de deleção de cliente inexistente retorna erro 404.


# 🛠️ Recursos utilizados

## Seed da base de dados

Os dados foram gerados com base no [gerador de pessoas](https://www.4devs.com.br/gerador_de_pessoas#google_vignette) do 4Devs.

```sql
INSERT INTO tb_client(name, cpf, income, birth_date, children) VALUES ('Nicole Laura Santos', '25978340773', 2630.0, '1987-02-19', 1);
INSERT INTO tb_client(name, cpf, income, birth_date, children) VALUES ('Gabriela Jéssica Antônia Cavalcanti', '17433154493', 15475.20, '1970-04-18', null);
INSERT INTO tb_client(name, cpf, income, birth_date, children) VALUES ('Liz Silvana Brito', '59520866752', 7641.33, '1957-05-02', 4);
INSERT INTO tb_client(name, cpf, income, birth_date, children) VALUES ('Juliana Andrea Adriana Nunes', '08943945337', 8463.02, '1981-11-11', 2);
INSERT INTO tb_client(name, cpf, income, birth_date, children) VALUES ('Ryan Thales de Paula', '56570601130', 8240.00, '1985-01-09', 2);
INSERT INTO tb_client(name, cpf, income, birth_date, children) VALUES ('Tiago Yago Freitas', '67520099610', 1620.00, '1988-02-01', 3);
INSERT INTO tb_client(name, cpf, income, birth_date, children) VALUES ('Julio Matheus Eduardo da Luz', '55450839014', 16030.00, '2000-03-19', null);
INSERT INTO tb_client(name, cpf, income, birth_date, children) VALUES ('Lucas Ryan Aparício', '58226957796', 9030.00, '2000-04-25', null);
INSERT INTO tb_client(name, cpf, income, birth_date, children) VALUES ('Eduarda Lucas Romaneli', '08823569923', 11045.00, '1984-07-15', null);
INSERT INTO tb_client(name, cpf, income, birth_date, children) VALUES ('Maiara Luz Spnoza', '06564977930', 18658.00, '1977-02-20', 3);
```

## Testes no Postman

### Lista todos os clientes - GET
```txt
http://localhost:8080/clients
```
### Busca cliente específico - GET
http://localhost:8080/clients/{id}

```txt
http://localhost:8080/clients/1
```
### Inserir usuário - POST
raw - body
```json
{
    "name": "Rayane Mara Vilha",
    "cpf": "35236975301",
    "income": 2500.00,
    "birthDate": "1977-02-19",
    "children": 1
}
```

```json
{
    "name": "X",
    "cpf": "35236975301",
    "income": 10000.00,
    "birthDate": "2020-01-01",
    "children": null
}
```
### Atualiza cliente por id - PUT
http://localhost:8080/clients/{id}

raw - body
```json
{
    "name": "Rayane Mara Vilha",
    "cpf": "35236975301",
    "income": 2500.00,
    "birthDate": "1977-02-19",
    "children": 1
}
```


### Deleta cliente por id - DELETE
http://localhost:8080/clients/{id}

```txt
http://localhost:8080/clients/1
```

