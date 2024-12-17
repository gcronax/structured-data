import java.util.ArrayList;
import java.util.Scanner;

public class ej3_3 {
    public static void addinv(ArrayList<String> inventario, String producto) {
        inventario.add(producto);
    }

    public static boolean find(ArrayList<String> inventario, String producto) {
        return inventario.contains(producto);
    }

    public static void delproduct(ArrayList<String> inventario, String producto) {
        inventario.remove(producto);
    }

    public static void main(String[] args) {
        ArrayList<String> inventario = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        

        addinv(inventario, "manzanas");
        addinv(inventario, "naranjas");
        addinv(inventario, "platanos");
        addinv(inventario, "uvas");
        addinv(inventario, "peras");

        System.out.println("Inventario: " + inventario);

        System.out.print("Buscar producto: ");
        String find = scan.nextLine();
        if (find(inventario, find)) {
            System.out.println( find + " esta");
        } else {
            System.out.println(find + " no esta");
        }

        System.out.print("Eliminar producto: ");
        String product = scan.nextLine();
        delproduct(inventario, product);

        System.out.println("Inventario final: " + inventario);
    }

    
}
