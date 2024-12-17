package org.example.validations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParImparTest {
    ParImpar parImpar = new ParImpar();

    @Test
    void deveRetornarTrueParaListasValidasDePG() {
        // ARRANGE
        var list1 = List.of(1, 3, 33, 45, 57, 59); // todos impares

        // ACT
        boolean resultado = parImpar.validar(list1);

        // ASSERT
        assertTrue(resultado, "A lista 'list1' deveria ser válida.");
    }

    @Test
    void deveRetornarFalseParaListasInvalidasDePG() {
        // ARRANGE
        var list1 = List.of(1, 3, 5, 7, 10, 20); // 4 impares e 2 pares

        // ACT
        boolean resultado = parImpar.validar(list1);

        // ASSERT
        assertFalse(resultado, "A lista 'list1' não deveria ser válida.");
    }
}