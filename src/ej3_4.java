import java.util.ArrayList;
import java.util.Scanner;

public class ej3_4 {

    public static void main(String[] args) {
        ArrayList<Double> calificaciones = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        calificaciones.add(1.1);
        calificaciones.add(1.2);
        calificaciones.add(1.3);
        calificaciones.add(1.4);
        calificaciones.add(2.1);
        calificaciones.add(2.2);
        calificaciones.add(2.3);
        calificaciones.add(2.4);
        calificaciones.add(3.1);
        calificaciones.add(3.2);

        double sum=0.0;
        for (double n:calificaciones){
            sum+=n;
        }
        double avg =sum/calificaciones.size();
        for (double n:calificaciones){
            if (avg<n){
                System.out.println(n+" es mayor que el promedio");
            }else {
                System.out.println(n+ " es menor que el promedio");
            }
        }
        double max= calificaciones.getFirst();
        double min= calificaciones.getFirst();
        for (double n:calificaciones){
            if (max<n){
                max=n;
            }
            if (min>n){
                min=n;
            }
        }
        calificaciones.remove(min);
        calificaciones.remove(max);
        System.out.println("elimino " +min+" y "+max);
        System.out.println(calificaciones);








    }
}
