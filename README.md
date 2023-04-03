# Microserviços com Spring Boot e Spring Cloud

Esta aplicação em Java utilizando o framework Spring Boot, que tem como objetivo demonstrar a estrutura de um projeto de microserviços utilizando a arquitetura RESTful, utilizando também contâiners Docker.

## Visão Geral

O projeto consiste em três microserviços que se comunicam entre si, utilizando o protocolo HTTP, a fim de realizar o gerenciamento de produtos. A comunicação entre eles é feita através de requisições RESTful.

Os microserviços são:

<ul>
  <li><strong>HR-CONFIG-SERVER:</strong> Servidor que puxa as configurações dos microserviços apartir de um repositório no GitHub.</li>
  <li><strong>HR-EUREKA-SERVER:</strong> Responsável por registrar os microserviços que estão em execução e disponibilizá-los para outros microserviços que precisam interagir com eles. </li>
  <li><strong>HR-API-GATEWAY-ZUUL:</strong> Gateway que todos os serviços irão rodar</li>
  <li><strong>HR-USER: Reponsável pelos usuários do banco.</strong> </li>
  <li><strong>HR-WORKER:</strong> Responsável pelo dado do funcionário, quanto ele ganha, dias trabalhados.</li>
  <li><strong>HR-PAYROLL:</strong> Responsável por gerar a folha de pagamento apartir do funcionário e os dias trabalhados.</li>
  <li><strong>HR-OAUTH:</strong> Responsável pelo gerenciamento de usuários, permitindo a criação de novos usuários, consulta de usuários existentes e atualização de informações de usuários.</li>
</ul>

A arquitetura do projeto é baseada em containers Docker.

## Como executar o projeto 

Para executar o projeto, é necessário ter instalado na máquina o Spring Tool Suite ou IntelliJ podendo ser testada no Postman ou Insomnia.

Após a instalação, basta clonar o repositório e executar os microsserviços nesta ordem:

```
hr-config-server
hr-eureka-server
hr-api-gateway-zuul
hr...
```

Os endpoints disponíveis em cada microserviço podem ser consultados na documentação da API, que está disponível nos seguintes links:

<strong>HR-CONFIG-SERVER:<strong> http://hr-config-server:8888/ <br>
<strong>HR-EUREKA-SERVER:<strong> http://hr-eureka-server:8671/ <br>
<strong>HR-API-GATEWAY-ZUUL:<strong> http://hr-api-gateway-zuul:8765/

## Considerações finais

Este projeto é apenas uma demonstração da estrutura básica de um projeto de microserviços utilizando o framework Spring Boot. Podendo ser utilizado em ambiente de teste, desenvolvimento e produção, foi bem legal realizar este projeto aprendi muita coisa que fará muita diferença daqui para frente.

## Diagramas

![model1](https://user-images.githubusercontent.com/62243365/229194193-0bb6abea-485b-4e50-a9f8-283e8e221370.png)
![model2](https://user-images.githubusercontent.com/62243365/229194196-ce72669b-a086-4e59-a2c6-b19a2accb6be.png)

## Demonstação em vídeo

Link: https://www.linkedin.com/feed/update/urn:li:activity:7048701557336416256/
