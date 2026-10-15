# Exercício 11.1 — Cobrir bordas da API

## Alvo escolhido

`QualityClassifier`, uma classe pura responsável por classificar a qualidade da conexão a partir do RTT e da perda de pacotes.

## Testes adicionados

- `classifiesRttAtModerateBoundary`: testa a borda em que o RTT é exatamente `60.0 ms`. Pela regra atual, esse valor já deve ser classificado como `MODERATE`.
- `rejectsNegativeRtt`: testa um caminho triste com RTT negativo. O método deve rejeitar a entrada lançando `IllegalArgumentException`.

Os testes seguem Arrange–Act–Assert e cada um verifica um comportamento específico. Os testes anteriores foram mantidos.

## Execução e observações

Com Java e Maven instalados, executar na raiz do projeto:

```bash
mvn test
```

Neste ambiente de preparação, o comando não pôde ser executado porque o Maven (`mvn`) não está instalado. Portanto, a execução dos testes ainda precisa ser confirmada localmente; não afirmar que passaram até conferir o resultado.

## Pull request

Link do PR: preencher com o link do Pull Request criado no repositório da squad.
