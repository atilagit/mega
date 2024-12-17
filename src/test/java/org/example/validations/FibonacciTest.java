package org.example.validations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FibonacciTest {

    @Test
    void deveRetornarTrueParaListasValidasDeFibonacci() {
        // ARRANGE
        var fibonacciClassica = List.of(1, 2, 3, 5, 8, 13);
        var fibonacciV0 = List.of(1, 2, 3, 5, 8, 13);
        var fibonacciV1 = List.of(2, 3, 5, 8, 13, 21);
        var fibonacciV2 = List.of(3, 5, 8, 13, 21, 34);
        var fibonacciV3 = List.of(5, 8, 13, 21, 34, 55);

        // ACT & ASSERT
        assertTrue(Fibonacci.validar(fibonacciClassica), "A lista 'fibonacciClassica' deveria ser válida.");
        assertTrue(Fibonacci.validar(fibonacciV0), "A lista 'fibonacciV0' deveria ser válida.");
        assertTrue(Fibonacci.validar(fibonacciV1), "A lista 'fibonacciV1' deveria ser válida.");
        assertTrue(Fibonacci.validar(fibonacciV2), "A lista 'fibonacciV2' deveria ser válida.");
        assertTrue(Fibonacci.validar(fibonacciV3), "A lista 'fibonacciV3' deveria ser válida.");
    }

    @Test
    void deveRetornarFalseParaListasInvalidasDeFibonacci() {
        // ARRANGE
        var listaInvalida = List.of(1, 2, 3, 5, 8, 12); // Contém um número que não é da sequência de Fibonacci

        // ACT
        boolean resultado = Fibonacci.validar(listaInvalida);

        // ASSERT
        assertFalse(resultado, "A lista 'listaInvalida' não deveria ser válida.");
    }
}
