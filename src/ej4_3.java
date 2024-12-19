import java.util.Scanner;

public class ej4_3 {
    public static void main(String[] args) {
        String prueba="qwertyuiiiiioopdddfvv";
        String retorno="";
        int maxn=0;
        char letra=' ';
        for (int i = 0; i < prueba.length(); i++) {
            int n=0;
            for (int j = 0; j < prueba.length(); j++) {
                    if (prueba.charAt(i)==prueba.charAt(j)){
                        n++;
                    }
                    if (n>1&&prueba.charAt(i)==prueba.charAt(j)){
                        if (maxn<n) {
                            maxn=n;
                            letra=prueba.charAt(i);
                        }
                    }


            }
            
        }
        System.out.println(letra+" se repite "+maxn);
    }
    
}
