public class ej1_5 {
    public static void main(String[] args) {
        int[] n = {5, 2, 9, 1, 3};

        for (int aux:n){
            System.out.println((aux%2==0)?"par  "+aux:"impar  "+aux);
        }
    }
}
