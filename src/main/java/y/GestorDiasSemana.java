package y;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestorDiasSemana {
    private List<String> diasSemana;

    public GestorDiasSemana() {
        this.diasSemana = new ArrayList<>();
    }

    public void crearListaDiasSemana() {
        diasSemana.add("Lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miércoles");
        diasSemana.add("Jueves");
        diasSemana.add("Viernes");
        diasSemana.add("Sábado");
        diasSemana.add("Domingo");
    }

    public List<String> getDiasSemana() {
        return diasSemana;
    }

    public int getLargoLista() {
        return diasSemana.size();
    }

    public void eliminarDia(String dia) {
        diasSemana.remove(dia);
    }

    public String getDia(int indice) {
        if (indice >= 0 && indice < diasSemana.size()) {
            return diasSemana.get(indice);
        }
        return null;
    }

    public boolean existeDia(String dia) {
        return diasSemana.contains(dia);
    }

    public void ordenarAlfabeticamente() {
        Collections.sort(diasSemana);
    }

    public void vaciarLista() {
        diasSemana.clear();
    }
}
