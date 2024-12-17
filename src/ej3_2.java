import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ej3_2 {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        

        for (int i = 0; i < 10; i++) {
            n.add(new Random().nextInt(100) + 1);
        }

        int sum = 0;
        int max = n.get(0);
        int min = n.get(0);

        for (int num : n) {
            sum += num;
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Números: " + n);
        System.out.println("Suma de los números: " + sum);
        System.out.println("Número mayor: " + max);
        System.out.println("Número menor: " + min);

        Collections.sort(n);
        System.out.println("Lista en orden ascendente: " + n);

        Collections.sort(n, Collections.reverseOrder());
        System.out.println("Lista en orden descendente: " + n);
    }
}
