public class bubble2 {
    // Método para ordenar con Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Bucle externo
        for (int i = 0; i < n - 1; i++) {
            // Bucle interno
            for (int j = 0; j < n - i - 1; j++) {
                // Comparar elementos consecutivos
                if (arr[j] > arr[j + 1]) {
                    System.out.println("Intercambio: " + arr[j] + " con " + arr[j + 1]);

                    // Intercambio
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] datos = {1, 10, 2, 3, 4, 5, 6};

        System.out.println("Arreglo original:");
        for (int dato : datos) {
            System.out.print(dato + " ");
        }

        bubbleSort(datos); // Llamada al método

        System.out.println("\n\nArreglo ordenado:");
        for (int dato : datos) {
            System.out.print(dato + " ");
        }
    }
}
