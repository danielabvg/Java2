package unidad3.lista.simple;

public class lista_simplemente_enlazada {

    // Nodo de la lista
    static class Nodo {
        double precision;
        double error;
        Nodo siguiente;

        Nodo(double precision, double error) {
            this.precision = precision;
            this.error = error;
            this.siguiente = null;
        }
    }

    // Lista simplemente enlazada
    static class ListaEnlazada {
        Nodo cabeza;

        void agregar(double precision, double error) {
            Nodo nuevo = new Nodo(precision, error);
            if (cabeza == null) {
                cabeza = nuevo;
                return;
            }
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }

        void imprimir() {
            Nodo actual = cabeza;
            while (actual != null) {
                System.out.println("Precisión: " + actual.precision +
                        ", Error: " + actual.error);
                actual = actual.siguiente;
            }
        }

        Nodo buscar(double precision) {
            Nodo actual = cabeza;
            while (actual != null) {
                if (actual.precision == precision) return actual;
                actual = actual.siguiente;
            }
            return null;
        }
    }

    // MÉTODO MAIN PARA PROBAR LA LISTA
    public static void main(String[] args) {
        ListaEnlazada historial = new ListaEnlazada();

        // Agregar métricas al final
        historial.agregar(0.80, 0.30);
        historial.agregar(0.85, 0.25);
        historial.agregar(0.90, 0.20);

        // Imprimir historial
        System.out.println("Historial de entrenamiento:");
        historial.imprimir();

        // Buscar una métrica
        Nodo resultado = historial.buscar(0.85);
        if (resultado != null) {
            System.out.println("\nMétrica encontrada:");
            System.out.println("Precisión: " + resultado.precision +
                    ", Error: " + resultado.error);
        } else {
            System.out.println("\nMétrica no encontrada.");
        }
    }
}
