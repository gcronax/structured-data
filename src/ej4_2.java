import java.util.Scanner;

public class ej4_2 {
    public static void main(String[] args) {
        String prueba="hola";
        String retorno1="";
        String retorno2="";

        Scanner scan = new Scanner(System.in);
        System.out.print("dame que posiciones movemos a la derecha: ");
        int n=scan.nextInt();
        for (int i = 0; i < prueba.length(); i++) {

            if (i+n>=prueba.length()) {
                retorno2+=prueba.charAt(i);
            }else {
                retorno1+=prueba.charAt(i);
            }

        }
        System.out.println(retorno2+retorno1);
    }
}
