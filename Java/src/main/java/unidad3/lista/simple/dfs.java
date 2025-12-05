package unidad3.lista.simple;

import java.util.Stack;

public class dfs {
    public static void main(String[] args) {

        // Pila para simular el recorrido DFS (LIFO)
        Stack<String> pila = new Stack<>();

        // Agregar nodos a explorar
        pila.push("Nodo A");
        pila.push("Nodo B");
        pila.push("Nodo C");

        // Procesar nodos en orden LIFO
        while (!pila.isEmpty()) {
            String nodo = pila.pop(); // Toma el último agregado
            System.out.println("Explorando: " + nodo);
        }
    }
}
