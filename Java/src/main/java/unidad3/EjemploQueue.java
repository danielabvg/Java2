package unidad3;

import java.util.LinkedList;
import java.util.Queue;

public class EjemploQueue {

    public static void main(String[] args) {

        //Instancia
        Queue<String> cola = new LinkedList<>();
        cola.add("Elemento 1");
        cola.add("Elemento 2");
        cola.add("Elemento 3");

        System.out.println("Contenido de la cola" + cola);
        System.out.println("Primer elemento" + cola.peek());
    }
}
