package org.example.validations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PGTest {

    @Test
    void deveRetornarTrueParaListasValidasDePG() {
        // ARRANGE
        var list1 = List.of(1, 2, 4, 8, 16, 32); // Lista válida de uma PG com razão 2

        // ACT
        boolean resultado = PG.validar(list1);

        // ASSERT
        assertTrue(resultado, "A lista 'list1' deveria ser válida.");
    }

    @Test
    void deveRetornarFalseParaListasInvalidasDePG() {
        // ARRANGE
        var list1 = List.of(1, 2, 3, 4, 5, 6); // Lista inválida que não é uma PG

        // ACT
        boolean resultado = PG.validar(list1);

        // ASSERT
        assertFalse(resultado, "A lista 'list1' não deveria ser válida.");
    }
}
