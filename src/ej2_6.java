public class ej2_6 {
    public static void main(String[] args) {
        int[][] aux = { {50, 60, 70, 40, 20, 80},
                        {30, 40, 50, 60, 70, 40},
                        {20, 30, 60, 70, 40, 40}};

        int n = 0;
        for (int i = 0; i < aux.length; i++) {
            int sum = 0;
            for (int j = 0; j < aux[0].length; j++) {
                sum += aux[i][j];
            }
            n += sum;
            System.out.println("product " + (i + 1) + ": " + sum);
        }

        for (int j = 0; j < aux[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < aux.length; i++) {
                sum += aux[i][j];
            }
            System.out.println("day " + (j + 1) + ": " + sum);
        }

        System.out.println("all week: " + n);
        
    }
    
}
