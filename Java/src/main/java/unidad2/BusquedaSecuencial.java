public class BusquedaSecuencial {

    // Método de búsqueda secuencial
    public static int busquedaSecuencial(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;  // se encontró el elemento
            }
        }
        return -1; // no se encontró
    }

    public static void main(String[] args) {

        int[] datos = {3, 5, 32, 7, 8, 5, 3, 9};
        int elemento = 9;

        int indice = busquedaSecuencial(datos, elemento);

        if (indice != -1) {
            System.out.println("Elemento " + elemento + " encontrado en el índice " + indice);
        } else {
            System.out.println("Elemento " + elemento + " no encontrado en la lista");
        }
    }
}

// Recorre el arreglo elemento por elemento, desde el inicio hasta encontrar el valor buscado.
//Es simple, pero puede ser más lenta porque revisatodo si esta al final.