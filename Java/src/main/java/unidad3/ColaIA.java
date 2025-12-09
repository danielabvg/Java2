package unidad3;

import java.util.LinkedList;
import java.util.Queue;

public class ColaIA {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        cola.add("Entrenar modelo A");
        cola.add("Entrenar modelo B");
        cola.add("Entrenar modelo C");

        while (!cola.isEmpty()) {
            System.out.println("Procesando: " + cola.poll());
        }
    }
}

