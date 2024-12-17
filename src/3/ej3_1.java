import java.util.ArrayList;

public class ej3_1 {
    public static void main(String[] args) {
        
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("a");
        nombres.add("b");
        nombres.add("c");
        nombres.add("d");
        nombres.add("e");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        String nombreBuscado = "d";
        if (nombres.contains(nombreBuscado)) {
            System.out.println("\nEl nombre " + nombreBuscado + " está en la lista.");
        } else {
            System.out.println("\nEl nombre " + nombreBuscado + " no está en la lista.");
        }

        nombres.remove("Pedro");
        System.out.println("\nLista actualizada:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        } 


    }
}
