package y;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestGestorDiasSemana {

    @Test
    void testCrearListaDiasSemana() {
        GestorDiasSemana gestor = new GestorDiasSemana();
        gestor.crearListaDiasSemana();
        assertEquals(7, gestor.getLargoLista());
    }

    @Test
    void testEliminarDia() {
        GestorDiasSemana gestor = new GestorDiasSemana();
        gestor.crearListaDiasSemana();
        gestor.eliminarDia("Lunes");
        assertFalse(gestor.existeDia("Lunes"));
        assertEquals(6, gestor.getLargoLista());
    }

    @Test
    void testOrdenarAlfabeticamente() {
        GestorDiasSemana gestor = new GestorDiasSemana();
        gestor.crearListaDiasSemana();
        gestor.ordenarAlfabeticamente();
        assertEquals("Domingo", gestor.getDia(0));
        assertEquals("Jueves", gestor.getDia(4));
    }

    @Test
    void testVaciarLista() {
        GestorDiasSemana gestor = new GestorDiasSemana();
        gestor.crearListaDiasSemana();
        gestor.vaciarLista();
        assertEquals(0, gestor.getLargoLista());
    }
}
