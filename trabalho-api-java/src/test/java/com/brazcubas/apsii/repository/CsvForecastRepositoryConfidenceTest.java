package com.brazcubas.apsii.repository;

import com.brazcubas.apsii.model.Forecast;
import com.brazcubas.apsii.model.PredictionModel;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.DefaultResourceLoader;

import java.time.Instant;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CsvForecastRepositoryConfidenceTest {

    @Test
    void shouldConvertBlankConfidenceToNullAcceptZeroAndOneAndDiscardInvalidRows() {
        // Arrange: use the test CSV and register model-a as a known model.
        ModelRepository modelRepository = mock(ModelRepository.class);
        when(modelRepository.findAll()).thenReturn(List.of(new PredictionModel(
                "model-a", "Model A", "Test model", "test", "test", "1.0", true,
                Instant.parse("2026-01-01T00:00:00Z"))));
        CsvForecastRepository repository = new CsvForecastRepository(
                new DefaultResourceLoader(), modelRepository,
                "classpath: model-confidence-cases.csv".replace("classpath: ", "classpath:"));

        // Act: load the fixture through the repository's normal CSV-reading path.
        repository.load();

        // Assert: blank becomes null, inclusive boundary values survive, invalid rows are skipped.
        List<Forecast> forecasts = repository.findAll();
        assertEquals(3, forecasts.size());
        assertNull(forecasts.stream().filter(f -> f.predictionId().equals("confidence-empty"))
                .findFirst().orElseThrow().modelConfidence());
        assertEquals(0.0, forecasts.stream().filter(f -> f.predictionId().equals("confidence-zero"))
                .findFirst().orElseThrow().modelConfidence());
        assertEquals(1.0, forecasts.stream().filter(f -> f.predictionId().equals("confidence-one"))
                .findFirst().orElseThrow().modelConfidence());
    }
}
