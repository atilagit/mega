package org.example.validations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PATest {
    PA pa = new PA();

    @Test
    void deveRetornarTrueQuandoExistirPedacoDePA() {
        // ARRANGE
        var list1 = List.of(1, 2, 3, 4, 5, 6); // PA completa
        var list2 = List.of(1, 2, 5, 8, 11, 14); // Pedaço de PA (2, 5, 8, 11, 14)
        var list3 = List.of(2, 3, 6, 9, 12, 15); // Pedaço de PA (3, 6, 9, 12, 15)
        var list4 = List.of(6, 12, 18, 24, 30, 36); // PA completa
        var list5 = List.of(7, 14, 21, 28, 35, 50); // Pedaço de PA (7, 14, 21, 28, 35)
        var list6 = List.of(1, 7, 13, 19, 25, 31); // Pedaço de PA (7, 13, 19, 25, 31)


        // ACT & ASSERT
        assertTrue(pa.validar(list1), "A lista 'list1' deveria ser válida.");
        assertTrue(pa.validar(list2), "A lista 'list2' deveria conter um pedaço de PA.");
        assertTrue(pa.validar(list3), "A lista 'list3' deveria conter um pedaço de PA.");
        assertTrue(pa.validar(list4), "A lista 'list4' deveria ser válida (PA completa).");
        assertTrue(pa.validar(list5), "A lista 'list5' deveria conter um pedaço de PA.");
        assertTrue(pa.validar(list6), "A lista 'list6' deveria conter um pedaço de PA.");
    }

    @Test
    void deveRetornarFalseQuandoNaoExistirPedacoDePA() {
        // ARRANGE
        var list1 = List.of(1, 2, 4, 7, 11, 16); // Razões inconsistentes
        var list2 = List.of(2, 5, 9, 14, 20, 27); // Razões inconsistentes
        var list3 = List.of(3, 6, 10, 15, 22, 30); // Razões inconsistentes
        var list4 = List.of(1, 3, 6, 10, 15, 21); // Progressão não aritmética (é triangular)
        var list5 = List.of(1, 4, 9, 12, 18, 26); // Razões inconsistentes

        // ACT & ASSERT
        assertFalse(pa.validar(list1), "A lista 'list1' não deveria conter um pedaço de PA.");
        assertFalse(pa.validar(list2), "A lista 'list2' não deveria conter um pedaço de PA.");
        assertFalse(pa.validar(list3), "A lista 'list3' não deveria conter um pedaço de PA.");
        assertFalse(pa.validar(list4), "A lista 'list4' não deveria conter um pedaço de PA.");
        assertFalse(pa.validar(list5), "A lista 'list5' não deveria conter um pedaço de PA.");
    }
}
