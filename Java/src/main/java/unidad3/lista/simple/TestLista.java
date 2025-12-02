package unidad3.lista.simple;

public class TestLista {

    public static void main(String[] args) {

        // Crear una instancia de la lista enlazada
        ListaEnlazada lista = new ListaEnlazada();

        System.out.println("Insertar nuevos datos al inicio");

        // Probar inserciones
        lista.insertarAlInicio(10);
        lista.insertarAlInicio(5);

        System.out.println("Insertar nuevos datos al final");

        lista.insertarAlFinal(20);
        lista.insertarAlFinal(30);

        lista.insertarAlInicio(50);

        // Imprimir la lista para verificar
        lista.imprimirLista();
    }
}


