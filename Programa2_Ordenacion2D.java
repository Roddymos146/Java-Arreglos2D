import java.util.Arrays;

public class Programa2_Ordenacion2D {

    // Método para imprimir la matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }

    public static void main(String[] args) {
        // Matriz 3x3 de ejemplo
        int[][] matriz = {
                {9, 3, 7},
                {5, 1, 8},
                {6, 4, 2}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        // Ordenamos la fila 1 (segunda fila) con Arrays.sort()
        int filaOrdenar = 1;
        Arrays.sort(matriz[filaOrdenar]);

        System.out.println("\nMatriz después de ordenar la fila " + filaOrdenar + ":");
        imprimirMatriz(matriz);
    }
}
