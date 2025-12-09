package unidad3.simuladorDFS;

public class SimuladorDFS {

    public static void main(String[] args) {

        // ---- Grafo del ejercicio ----
        // A -> B, C
        // B -> E
        // C -> D
        String[][] grafo = {
                {"A", "B", "C"},
                {"B", "E"},
                {"C", "D"},
                {"D"},
                {"E"}
        };

        PilaListaEnlazada pila = new PilaListaEnlazada();

        // Inicio del recorrido
        System.out.println("Inicio: PUSH(A)");
        pila.push("A");
        pila.mostrar();
        System.out.println();

        // Para registrar nodos visitados
        String visitados = "";

        while (!pila.estaVacia()) {

            // POP
            String nodo = pila.pop();
            System.out.println("POP & Visitar: " + nodo);
            pila.mostrar();

            if (!visitados.contains(nodo)) {
                visitados += nodo + " ";

                // Buscar vecinos del nodo en la matriz "grafo"
                for (String[] fila : grafo) {
                    if (fila[0].equals(nodo)) {

                        for (int i = 1; i < fila.length; i++) {
                            System.out.println("PUSH(" + fila[i] + ")");
                            pila.push(fila[i]);
                            pila.mostrar();
                        }
                        System.out.println();
                    }
                }
            }
        }

        System.out.println("\nFin del recorrido DFS");
        System.out.println("Visitados (orden): " + visitados);
    }
}

