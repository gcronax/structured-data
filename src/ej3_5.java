import java.util.ArrayList;

public class ej3_5 {
    public static void main(String[] args) {
        ArrayList<String> personas = new ArrayList<>();
        personas.add("persona1");
        personas.add("persona2");
        personas.add("persona3");
        personas.add("persona4");
        System.out.println("añado una persona_control");
        personas.add("persona_control");

        System.out.println("elimino el primero de la cola, pues ya esta atendido");
        personas.removeFirst();
        System.out.println(personas);
        System.out.println("elimino el primero de la cola, pues ya esta atendido");
        personas.removeFirst();
        System.out.println(personas);
        System.out.println("elimino el primero de la cola, pues ya esta atendido");
        personas.removeFirst();
        System.out.println(personas);
        System.out.println("elimino el primero de la cola, pues ya esta atendido");
        personas.removeFirst();
        System.out.println(personas);

    }

}
