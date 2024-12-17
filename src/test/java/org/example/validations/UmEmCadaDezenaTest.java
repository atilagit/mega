package org.example.validations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UmEmCadaDezenaTest {

    @Test
    void deveRetornarTrueQuandoUmNumeroEstiverEmCadaDezena() {
        // ARRANGE
        var list1 = List.of(1, 13, 26, 32, 48, 57); // Um número em cada dezena
        var list2 = List.of(9, 11, 29, 31, 49, 51); // Um número em cada dezena
        var list3 = List.of(4, 15, 26, 37, 48, 59); // Um número em cada dezena

        // ACT & ASSERT
        assertTrue(UmEmCadaDezena.validar(list1), "A lista 'list1' deveria conter um número em cada dezena.");
        assertTrue(UmEmCadaDezena.validar(list2), "A lista 'list2' deveria conter um número em cada dezena.");
        assertTrue(UmEmCadaDezena.validar(list3), "A lista 'list3' deveria conter um número em cada dezena.");
    }

    @Test
    void deveRetornarFalseQuandoNaoHaUmNumeroEmCadaDezena() {
        // ARRANGE
        var list1 = List.of(10, 20, 30, 42, 44, 45); // Não atende o critério
        var list2 = List.of(1, 10, 20, 30, 40, 50);  // Não atende o critério
        var list3 = List.of(9, 16, 29, 35, 48, 50);  // Não atende o critério

        // ACT & ASSERT
        assertFalse(UmEmCadaDezena.validar(list1), "A lista 'list1' não deveria atender ao critério.");
        assertFalse(UmEmCadaDezena.validar(list2), "A lista 'list2' não deveria atender ao critério.");
        assertFalse(UmEmCadaDezena.validar(list3), "A lista 'list3' não deveria atender ao critério.");
    }
}
