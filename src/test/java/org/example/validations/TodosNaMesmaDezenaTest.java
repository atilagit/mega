package org.example.validations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TodosNaMesmaDezenaTest {
    TodosNaMesmaDezena todosNaMesmaDezena = new TodosNaMesmaDezena();

    @Test
    void deveRetornarTrueQuandoTodosOsNumerosEstaoNaMesmaDezena() {
        // ARRANGE
        var list1 = List.of(1, 2, 4, 8, 9, 10);    // Todos estão na dezena 0-10
        var list2 = List.of(11, 12, 15, 18, 19, 20); // Todos estão na dezena 10-20
        var list3 = List.of(23, 24, 26, 27, 28, 29); // Todos estão na dezena 20-30
        var list4 = List.of(25, 26, 30, 31, 32, 34); // Todos estão na dezena 25-34

        // ACT & ASSERT
        assertTrue(todosNaMesmaDezena.validar(list1), "A lista 'list1' deveria estar na mesma dezena.");
        assertTrue(todosNaMesmaDezena.validar(list2), "A lista 'list2' deveria estar na mesma dezena.");
        assertTrue(todosNaMesmaDezena.validar(list3), "A lista 'list3' deveria estar na mesma dezena.");
        assertTrue(todosNaMesmaDezena.validar(list4), "A lista 'list4' deveria estar na mesma dezena.");
    }

    @Test
    void deveRetornarFalseQuandoNumerosNaoEstaoNaMesmaDezena() {
        // ARRANGE
        var list1 = List.of(10, 20, 30, 42, 44, 45); // Numeros pertencem a dezenas diferentes
        var list2 = List.of(1, 2, 3, 4, 5, 11);     // 11 pertence a outra dezena
        var list3 = List.of(23, 24, 26, 27, 28, 33); // 33 pertence a outra dezena

        // ACT & ASSERT
        assertFalse(todosNaMesmaDezena.validar(list1), "A lista 'list1' não deveria estar na mesma dezena.");
        assertFalse(todosNaMesmaDezena.validar(list2), "A lista 'list2' não deveria estar na mesma dezena.");
        assertFalse(todosNaMesmaDezena.validar(list3), "A lista 'list3' não deveria estar na mesma dezena.");
    }
}
