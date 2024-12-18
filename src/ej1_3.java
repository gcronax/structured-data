public class ej1_3 {
    public static void main(String[] args) {
        int[] n=new int[5];
        n[0]=1;
        n[1]=2;
        n[2]=30;
        n[3]=4;
        n[4]=5;
        int max=0;
        for (int aux:n){
            if (aux>max){
                max=aux;
            }
        }
        System.out.println(max);
    }
}
