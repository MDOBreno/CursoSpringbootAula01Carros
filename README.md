# Curso Springboot Aula 01 Carros

## Comando para rodar MySQL no Mac

### Comandos de executar e reiniciar o banco:

```sh
brew services start mysql
```
```sh
brew services restart mysql
```

### Comandos de conectar ao banco: via terminal
Exemplo com ip(localhost), porta(3306), usuario(vir_back), e senha(Stefanini@10):
```sh
mysql -u vir_back -p -h localhost -P 3306
Enter password: Stefanini@10
```

## Comandos para controlar a execução do serviço no macOS

### Opção 1
```sh
mvn spring-boot:run
```

### Opção 2
1) Baixe o SpringToolSuite4
2) Faça a importação como um projeto Maven
3) No "Package Explorer" expanda o caminho para:
```
src/main/java/com/oliverios/carros
```
4) Clique o botão direito em "CarrosApplication.java"
	-> "Debug As"
	-> "Spring Boot App" (⌥⇧DB)

## Caso deseje mudar configurações de Build
1) Acesse o arquivo em:
```
src/main/resources/application.properties
```
2) Escreva ou edite alguma propriedade, por exemplo mudar a porta do serviço das APis:
```
server.port=9090
```

## Documentacoes do Professor

### Criacao de nojos projetos:
https://start.spring.io

### Repositorio do Profcom trechos de codigo prontos:
https://github.com/rlechetaudemy/carros_springboot
