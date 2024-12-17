import java.util.Arrays;

public class ej6 {
    public static void main(String[] args) {
        int[] n = {101, 102, 103, 104, 105};
        int[] auxn=new int[n.length+1];
        int temp;
        int input=111;
        auxn[0]=input;
        int i=0;
        for (int aux:n){
            auxn[i+1]=n[i];
            i++;


        }
        System.out.println(Arrays.toString(auxn));
    }
}
