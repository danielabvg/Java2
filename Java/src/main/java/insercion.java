public class insercion {
    public static void main(String[] args) {

        int[] arr = {8, 3, 5, 2};  // n = 4
        System.out.println("Arreglo original:");
        printArray(arr);

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];       // Guardamos el valor a insertar
            int j = i - 1;

            System.out.println("\nIteración " + i + ":");
            System.out.println("Key = " + key);

            // Mover elementos mayores que key a la derecha
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key; // Insertamos la key en su posición
            printArray(arr);
        }

        System.out.println("\nArreglo ordenado:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
