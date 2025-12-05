package unidad3;

import java.util.LinkedList;
import java.util.Queue;

public class EjemploQueue {

    public static void main(String[] args) {

        // Instancia de la cola
        Queue<String> cola = new LinkedList<>();
        cola.add("Elemento 1");
        cola.add("Elemento 2");
        cola.add("Elemento 3");

        System.out.println("Contenido de la cola: " + cola);

        // peek() solo mira el primer elemento sin eliminarlo
        System.out.println("Primer elemento (peek): " + cola.peek());

        // poll() obtiene y elimina el primer elemento
        String eliminado = cola.poll();
        System.out.println("Elemento eliminado con poll(): " + eliminado);

        // Cola después del poll
        System.out.println("Contenido de la cola después del poll: " + cola);
    }
}

