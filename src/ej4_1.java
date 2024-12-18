import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ej4_1 {
    public static void main(String[] args) {
        String prueba="qwertyuiioopdddfvv";
        String retorno="";

        for (int i = 0; i < prueba.length(); i++) {
            int n=0;
            boolean unico=true;
            for (int j = 0; j < prueba.length(); j++) {
                    if (prueba.charAt(i)==prueba.charAt(j)){
                        n++;
                    }
                    if (n>1&&prueba.charAt(i)==prueba.charAt(j)){
                        unico=false;
                    }


            }
            if (unico){
                retorno+=prueba.charAt(i);
            }
        }
        System.out.println(retorno);
    }
}
