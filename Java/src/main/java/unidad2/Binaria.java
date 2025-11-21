package unidad2;

public class Binaria {

    // Metodo de búsqueda binaria
    public static int busquedaBinaria(int[] arr, int x) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (arr[medio] == x) {
                return medio; // encontrado
            }

            if (arr[medio] < x) {
                inicio = medio + 1; // buscar en la derecha
            } else {
                fin = medio - 1; // buscar en la izquierda
            }
        }

        return -1; // no encontrado
    }

    public static void main(String[] args) {

        // El arreglo debe estar ORDENADO
        int[] datos = {3, 5, 7, 8, 12, 18, 25, 32, 40};

        int elemento = 18;

        int indice = busquedaBinaria(datos, elemento);

        if (indice != -1) {
            System.out.println("Elemento " + elemento + " encontrado en el índice " + indice);
        } else {
            System.out.println("Elemento " + elemento + " no encontrado en la lista");
        }
    }
}

// Busca en un arreglo ordenado, dividiéndolo a la mitad en cada paso.
//Es mucho más rápida porque descarta grandes partes del arreglo en cada comparación.
