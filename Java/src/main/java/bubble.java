public class bubble { // Corregido: La clase ahora usa UpperCamelCase

    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 5, 6};

        System.out.println("Lista original: " + java.util.Arrays.toString(numeros));

        bubbleSort(numeros);

        System.out.print("Lista ordenada: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println(); // Salto de línea al final
    }

    /**
     * Implementación optimizada del algoritmo Bubble Sort.
     * Incluye una bandera para terminar la ejecución si no hay intercambios (O(N) en el mejor caso).
     * @param arr El arreglo de enteros a ordenar.
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped; // Bandera de optimización

        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Asumimos que la lista está ordenada al inicio de cada pase

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar los elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // Se realizó un intercambio
                }
            }

            // Si no hubo intercambio en este pase, el arreglo está ordenado y salimos.
            if (!swapped) {
                break;
            }
        }
    }
}


