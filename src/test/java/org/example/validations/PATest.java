package org.example.validations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PATest {

    @Test
    void deveRetornarTrueParaListasValidasDePA() {
        // ARRANGE
        var list1 = List.of(1, 2, 3, 4, 5, 6);
        var list2 = List.of(3, 6, 9, 12, 15, 18);
        var list3 = List.of(5, 10, 15, 20, 25, 30);
        var list4 = List.of(30, 36, 42, 48, 54, 60);

        // ACT & ASSERT
        assertTrue(PA.validar(list1), "A lista 'list1' deveria ser válida.");
        assertTrue(PA.validar(list2), "A lista 'list2' deveria ser válida.");
        assertTrue(PA.validar(list3), "A lista 'list3' deveria ser válida.");
        assertTrue(PA.validar(list4), "A lista 'list4' deveria ser válida.");
    }

    @Test
    void deveRetornarFalseParaListasInvalidasDePA() {
        // ARRANGE
        var list1 = List.of(1, 2, 3, 4, 5, 60); // O último elemento quebra a progressão
        var list2 = List.of(3, 8, 9, 12, 15, 18); // Segundo elemento quebra a razão
        var list3 = List.of(5, 10, 15, 21, 25, 30); // Quarto elemento quebra a progressão
        var list4 = List.of(30, 36, 42, 48, 53, 60); // Quinto elemento quebra a progressão

        // ACT & ASSERT
        assertFalse(PA.validar(list1), "A lista 'list1' não deveria ser válida.");
        assertFalse(PA.validar(list2), "A lista 'list2' não deveria ser válida.");
        assertFalse(PA.validar(list3), "A lista 'list3' não deveria ser válida.");
        assertFalse(PA.validar(list4), "A lista 'list4' não deveria ser válida.");
    }
}
