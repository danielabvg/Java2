package unidad3;

public class nodo {
    String mensaje;
    nodo siguiente;

    public nodo(String mensaje) {
        this.mensaje = mensaje;
        this.siguiente = null;
    }
}

class HistorialChatbot {
    nodo cabeza;

    public void agregar(String mensaje) {
        nodo nuevo = new nodo(mensaje);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            nodo aux = cabeza;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
    }

    public void imprimir() {
        nodo aux = cabeza;
        System.out.println("Historial del chatbot:");
        while (aux != null) {
            System.out.println("- " + aux.mensaje);
            aux = aux.siguiente;
        }
    }
}

