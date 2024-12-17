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
            System.out.print(nombre+" ");
        }
        System.out.println();
        String find = "d";
        if (nombres.contains(find)) {
            System.out.println( find + " esta.");
        } else {
            System.out.println( find + " no esta");
        }
        nombres.remove("d");
        System.out.println("elemino d");
        for (String nombre : nombres) {
            System.out.print(nombre+" ");
        } 
    
    }
}


