# Connectivity Forecast API

Reimplementação Java/Spring Boot da [API de referência](https://github.com/LiniiS/connectivity-forecast-api), usada como artefato educacional de APS II.

## Executar

Requisitos: Java 17 e Maven 3.9+.

```bash
mvn test
mvn spring-boot:run
```

Swagger UI: `http://localhost:8080/swagger-ui.html`  
OpenAPI: `http://localhost:8080/v3/api-docs`

## Escopo

O Connectivity Forecast API é uma reimplementação educacional em Java com Spring Boot, desenvolvida para a disciplina de APS II. Seu objetivo é demonstrar a organização e o funcionamento de uma API REST que disponibiliza modelos de conectividade, localizações, previsões de rede e atividades.

A API funciona localmente e utiliza dados fictícios para simular previsões, sem depender de serviços externos ou de um banco de dados.

Dados disponíveis:

4 modelos ativos e 1 modelo inativo no catálogo.

10 probes (pontos de monitoramento).

24 instantes de previsão, totalizando 960 previsões simuladas.

Limitações: a aplicação não consulta o RIPE Atlas, não treina nem executa modelos de previsão e não realiza análises reais da conectividade da rede. As classificações e recomendações são baseadas em regras experimentais, desenvolvidas exclusivamente para fins educacionais.

O projeto pode ser executado localmente, sem necessidade de deploy ou infraestrutura externa, permitindo explorar os endpoints e compreender a estrutura de uma API REST com Spring Boot.

## Estrutura

Separação em controllers, services, repositories, modelos de domínio/DTOs e configuração. API versionada em `/api/v1`, com recursos de health, modelos, localizações, previsões e atividades.

## Documentação

README e OpenAPI são pontos de partida. Completar em exercício: descrição dos endpoints, parâmetros e validações, exemplos de requisição/resposta, códigos de erro e origem dos campos. Referência à licença MIT da API de origem preservada neste projeto.
