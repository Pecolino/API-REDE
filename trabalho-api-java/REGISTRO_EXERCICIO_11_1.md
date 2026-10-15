# Exercício 11.1 — Cobrir bordas da API

## Alvo escolhido

`QualityClassifier`, uma classe pura responsável por classificar a qualidade da conexão a partir do RTT e da perda de pacotes.

## Testes adicionados

- `classifiesRttAtModerateBoundary`: testa a borda em que o RTT é exatamente `60.0 ms`. Pela regra atual, esse valor é classificado como `MODERATE`.
- `rejectsNegativeRtt`: testa um caminho triste com RTT negativo. O método rejeita a entrada lançando `IllegalArgumentException`.

Os testes seguem Arrange–Act–Assert e cada um verifica um comportamento específico. Os testes anteriores foram mantidos.

## Execução e observações

Comando executado na raiz do projeto: `mvn test`.

**Resultado: passou (`BUILD SUCCESS`).** Foram executados 8 testes, com 0 falhas, 0 erros e 0 testes ignorados. O projeto compilou e os testes terminaram com código de saída `0`.

A execução foi feita no IntelliJ IDEA, usando Java 22.0.1; o Maven compilou o projeto com `release 17`. Durante a execução apareceram avisos do Mockito/Java sobre carregamento dinâmico de agente. Eles não impediram a execução e não houve falha nos testes.

## Pull request

Link do PR: preencher com o link do Pull Request criado no repositório da squad.
