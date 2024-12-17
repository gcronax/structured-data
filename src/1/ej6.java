import java.util.Arrays;

public class ej6 {
    public static int[] rotarDerecha(int[] fila, int n) {
        int[] raux = new int[fila.length + 1];
        raux[0] = n;
        for (int i = 0; i < fila.length; i++) {
            raux[i + 1] = fila[i];
        }
        return raux;
    }
    public static int[] rotarIzquierda(int[] fila) {
        int[] raux = new int[fila.length];
        for (int i = 0; i < fila.length - 1; i++) {
            raux[i] = fila[i + 1];
        }
        raux[fila.length - 1] = fila[0];
        return raux;
    }
    public static void main(String[] args) {
        int[] aux = {101, 102, 103, 104, 105};

        System.out.println("original: " + Arrays.toString(aux));

        aux = rotarDerecha(aux, 106);
        System.out.println("mover hacia la derecha: " + Arrays.toString(aux));

        aux = rotarIzquierda(aux);
        System.out.println("mover hacia la izquierda: " + Arrays.toString(aux));
    }
}
