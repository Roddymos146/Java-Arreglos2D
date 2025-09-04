public class Programa1_Busqueda2D {

    // Método que busca un valor en una matriz 2D
    public static int[] buscarValor(int[][] matriz, int valor) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valor) {
                    return new int[]{i, j}; // posición encontrada
                }
            }
        }
        return new int[]{-1, -1}; // si no se encontró
    }

    public static void main(String[] args) {
        // Matriz 3x3 de ejemplo
        int[][] matriz = {
                {5, 8, 3},
                {7, 1, 9},
                {4, 6, 2}
        };

        int valorBuscado = 9;
        int[] posicion = buscarValor(matriz, valorBuscado);

        if (posicion[0] != -1) {
            System.out.println("El valor " + valorBuscado +
                    " se encontró en la posición: [" + posicion[0] + ", " + posicion[1] + "]");
        } else {
            System.out.println("El valor " + valorBuscado + " no se encontró en la matriz.");
        }
    }
}
