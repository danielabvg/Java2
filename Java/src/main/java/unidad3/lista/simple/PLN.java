package unidad3.lista.simple;

import java.util.LinkedList;
import java.util.Queue;

public class PLN {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        cola.add("Analizar texto 1");
        cola.add("Analizar texto 2");
        cola.add("Analizar texto 3");

        while (!cola.isEmpty()) {
            System.out.println("Procesando: " + cola.poll());
        }
    }
}
