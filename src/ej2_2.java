public class ej2_2 {
    public static void main(String[] args) {
        int[][] n={ {1, 2, 3}, {4, 5, 6} };
        int sum=0;
        for (int i = 0; i < n.length; i++) {

            for (int j = 0; j < n[0].length; j++) {
                sum+=n[i][j];
            }

        }

        System.out.println(sum );

    }
}
