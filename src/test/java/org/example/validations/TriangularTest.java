package org.example.validations;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import java.util.List;

class TriangularTest {
    Triangular triangular = new Triangular();

    @Test
    void deveRetornarTrueParaListasValidasDeTriangulares() {
        // ARRANGE
        var triangularesClassica = List.of(1, 3, 6, 10, 15, 21);
        var triangularesV0 = List.of(3, 6, 10, 15, 21, 28);
        var triangularesV1 = List.of(6, 10, 15, 21, 28, 36);
        var triangularesV2 = List.of(10, 15, 21, 28, 36, 45);
        var triangularesV3 = List.of(15, 21, 28, 36, 45, 55);

        // ACT & ASSERT
        assertTrue(triangular.validar(triangularesClassica), "A lista 'triangularesClassica' deveria ser válida.");
        assertTrue(triangular.validar(triangularesV0), "A lista 'triangularesV0' deveria ser válida.");
        assertTrue(triangular.validar(triangularesV1), "A lista 'triangularesV1' deveria ser válida.");
        assertTrue(triangular.validar(triangularesV2), "A lista 'triangularesV2' deveria ser válida.");
        assertTrue(triangular.validar(triangularesV3), "A lista 'triangularesV3' deveria ser válida.");
    }

    @Test
    void deveRetornarFalseParaListasInvalidasDeTriangulares() {
        // ARRANGE
        var listaInvalida1 = List.of(1, 3, 6, 10, 15, 22); // O número 22 não é triangular
        var listaInvalida2 = List.of(3, 6, 9, 10, 15, 21); // O número 9 não é triangular
        var listaInvalida3 = List.of(5, 10, 15, 21, 28, 36); // O número 5 não é triangular

        // ACT & ASSERT
        assertFalse(triangular.validar(listaInvalida1), "A lista 'listaInvalida1' não deveria ser válida.");
        assertFalse(triangular.validar(listaInvalida2), "A lista 'listaInvalida2' não deveria ser válida.");
        assertFalse(triangular.validar(listaInvalida3), "A lista 'listaInvalida3' não deveria ser válida.");
    }
}
