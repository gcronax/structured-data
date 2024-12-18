import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ej4_1 {
    public static void main(String[] args) {
        String prueba="qwertyuiioopdddfvv";
        char[] aux = prueba.toCharArray();
        ArrayList retorno=new ArrayList();
        for (char c: aux){
            retorno.add(c);
        }
        
        System.out.println(Arrays.toString(retorno.stream().distinct().toArray()));
    }
}
