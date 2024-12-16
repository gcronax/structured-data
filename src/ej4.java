import java.util.Arrays;

public class ej4 {
    public static void main(String[] args) {
        int[] n = {5, 2, 9, 1, 3};

        for (int i = 0; i <n.length ; i++) {
            for (int j = 0; j < n.length - i - 1; j++) {
                if (n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(n));
    }
}
