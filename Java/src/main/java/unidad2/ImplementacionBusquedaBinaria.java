package unidad2;

public class ImplementacionBusquedaBinaria {

    // Metodo Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Metodo Búsqueda Binaria
    public static int busquedaBinaria(int[] arr, int x) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (arr[medio] == x) {
                return medio;
            } else if (arr[medio] < x) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        // Crear arreglo de 150 números + 999
        int[] datos = new int[151];

        for (int i = 0; i < 150; i++) {
            datos[i] = i + 1;
        }

        datos[150] = 999; // agregar el 999

        // Imprimir arreglo original
        System.out.println("Arreglo original:");
        for (int n : datos) {
            System.out.print(n + " ");
        }

        // Ordenar con Bubble Sort
        long startTime = System.nanoTime();
        bubbleSort(datos);
        long endTime = System.nanoTime();

        // Imprimir tiempo
        System.out.println("\n\nTiempo de ordenamiento: " + (endTime - startTime) + " nanosegundos");

        // Buscar 999
        int elementoBuscar = 999;
        int indice = busquedaBinaria(datos, elementoBuscar);

        // Resultado
        if (indice != -1) {
            System.out.println("Elemento " + elementoBuscar + " encontrado en el índice " + indice);
        } else {
            System.out.println("Elemento " + elementoBuscar + " NO encontrado.");
        }
    }
}
