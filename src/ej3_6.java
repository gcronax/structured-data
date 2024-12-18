import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import static java.util.Collections.sort;

public class ej3_6 {
    public static void addlibro(ArrayList<String> inventario, String producto) {
        inventario.add(producto);
    }

    public static boolean find(ArrayList<String> inventario, String producto) {
        return inventario.contains(producto);
    }

    public static void delproduct(ArrayList<String> inventario, String producto) {
        inventario.remove(producto);
    }

    public static ArrayList<String> ordenar(ArrayList<String> libros){
        ArrayList<String> aux = new ArrayList<>();
        aux=libros;
        sort(aux);
        return  aux;
    }

    public static void main(String[] args) {
        ArrayList<String> libros = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        addlibro(libros, "harry");
        addlibro(libros, "potahunta");
        addlibro(libros, "aeiou");
        addlibro(libros, "minecraft");
        addlibro(libros, "principito");

        int aux;
        do {
            System.out.println();
            System.out.println("Inventario: " + libros);
            System.out.println("1 para buscar un libro, 2 para eliminar un libro, 3 para añadir un libro,");
            System.out.println(" 4 para mostrar los libros en orden alfabetico y -1 para salir");
            aux=scan.nextInt();

            if (aux==1){
                System.out.print("Buscar producto: ");
                String find = scan.next();
                if (find(libros, find)) {
                    System.out.println( find + " esta");
                } else {
                    System.out.println(find + " no esta");
                }
            }
            if (aux==2){
                System.out.print("Eliminar producto: ");
                String libro = scan.next();
                delproduct(libros, libro);
            }
            if (aux==3){
                System.out.print("Añadir producto: ");
                String libro = scan.next();
                addlibro(libros, libro);
            }
            if (aux==4){
                System.out.println("Inventario final ordenado: " + ordenar(libros));

            }

        }while (aux!=-1);


    }
}
