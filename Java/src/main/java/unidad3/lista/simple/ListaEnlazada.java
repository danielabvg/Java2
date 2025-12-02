package unidad3.lista.simple;

public class ListaEnlazada {

    // Referencia al primer nodo de la lista
    Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    // Insertar al inicio
    public void insertarAlInicio(int nuevoDato) {

        Nodo nuevoNodo = new Nodo(nuevoDato);
        nuevoNodo.siguiente = cabeza;

        cabeza = nuevoNodo;
        System.out.println("Insertado al inicio: " + nuevoDato);
    }

    // Insertar al final
    public void insertarAlFinal(int nuevoDato) {

        Nodo nuevoNodo = new Nodo(nuevoDato);

        if (cabeza == null) {
            cabeza = nuevoNodo;
            System.out.println("Insertado al final (lista estaba vacía): " + nuevoDato);
            return;
        }

        Nodo temp = cabeza;
        while (temp.siguiente != null) {
            temp = temp.siguiente;
        }

        temp.siguiente = nuevoNodo;
        System.out.println("Insertado al final: " + nuevoDato);
    }

    // Imprimir lista completa
    public void imprimirLista() {
        Nodo actual = cabeza;

        System.out.println("Lista simple:");

        if (actual == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }

        System.out.println("null"); // Final de la lista
    }
}

