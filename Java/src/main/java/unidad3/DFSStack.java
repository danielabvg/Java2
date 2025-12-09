package unidad3;
import java.util.Stack;

public class DFSStack {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        pila.push("A");
        pila.push("B");
        pila.push("C");

        System.out.println("Procesando DFS:");
        while (!pila.isEmpty()) {
            String nodo = pila.pop();
            System.out.println("Visitando: " + nodo);
        }
    }
}

