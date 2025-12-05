package unidad3.lista.simple;

import java.util.LinkedList;
import java.util.ListIterator;

public class HistorialTransacciones {

    public static void main(String[] args) {

        LinkedList<String> historial = new LinkedList<>();

        System.out.println("Iniciamos el historial de transacciones");

        ListIterator<String> iterador = historial.listIterator();

        // Agregamos acciones con el iterador
        iterador.add("Acción 1: Crear Documento");
        iterador.add("Acción 2: Escribir Título");
        iterador.add("Acción 3: Insertar Imagen");

        System.out.println("\nHistorial Completo: " + historial);

        System.out.println("Estado Actual (Acción más reciente): " +
                historial.getLast());

        // --- UNDO 1 ---
        if (iterador.hasPrevious()) {
            String accionDes = iterador.previous();
            System.out.println("UNDO → " + accionDes);
        }

        // --- UNDO 2 ---
        if (iterador.hasPrevious()) {
            String accionDes = iterador.previous();
            System.out.println("UNDO → " + accionDes);
        }

        // Estado actual después de dos UNDO
        if (iterador.hasNext()) {
            System.out.println("Estado actual → " + iterador.next());
        }

        // --- REDO ---
        if (iterador.hasNext()) {
            String accionRes = iterador.next();
            System.out.println("REDO → " + accionRes);
        }

        // Estado final después del REDO
        System.out.println("Estado actual → " + historial.get(iterador.previousIndex()));
    }
}

