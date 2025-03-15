# Curso Springboot Aula 01 Carros

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
