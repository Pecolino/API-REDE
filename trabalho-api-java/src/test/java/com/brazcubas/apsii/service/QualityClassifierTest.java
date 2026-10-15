package com.brazcubas.apsii.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class QualityClassifierTest {
    private final QualityClassifier classifier = new QualityClassifier();

    @Test
    void classifiesRttAtModerateBoundary() {
        // Arrange: RTT exatamente no limite de 60 ms; Act: classificar; Assert: MODERATE.
        assertEquals("MODERATE", classifier.classify(60.0, 0.0));
    }

    @Test
    void rejectsNegativeRtt() {
        // Arrange: RTT negativo inválido; Act/Assert: a classificação deve lançar exceção.
        assertThrows(IllegalArgumentException.class, () -> classifier.classify(-1.0, 0.0));
    }

    @Test
    void classifiesGoodConnection() {
        assertEquals("GOOD", classifier.classify(30.0, 0.0));
    }

    @Test
    void classifiesModeratePacketLoss() {
        assertEquals("MODERATE", classifier.classify(40.0, 1.5));
    }

    @Test
    void worseMetricDeterminesQuality() {
        assertEquals("UNSTABLE", classifier.classify(20.0, 5.0));
    }
}
