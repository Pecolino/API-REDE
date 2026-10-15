# Exercício 11.2 — Proteção do campo opcional de confiança

## Alterações realizadas

- Adicionado `src/test/resources/model-confidence-cases.csv` com entradas para campo em branco, valores de borda `0` e `1`, valor fora da faixa e texto.
- Adicionado `CsvForecastRepositoryConfidenceTest`, que carrega a fixture pelo fluxo normal do repositório e verifica que o campo em branco vira `null`, `0` e `1` são aceitos, e linhas com valor inválido são descartadas.
- Adicionado o plugin JaCoCo ao `pom.xml`, com preparação do agente de cobertura e geração do relatório na fase `verify`.

## Como verificar

Execute na raiz do projeto:

```bash
mvn verify
```

O relatório HTML do JaCoCo será gerado em `target/site/jacoco/index.html`.

## Pull request e evidência

Link do PR: preencher após publicar a branch e abrir o pull request.

Evidência do JaCoCo: anexar uma captura de tela de `target/site/jacoco/index.html` após executar `mvn verify`.
