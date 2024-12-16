public class ej2_3 {
    public static void main(String[] args) {
        int[][] n=new int[3][3];
        n[0][0]=1;
        n[0][1]=2;
        n[0][2]=3;
        n[1][0]=4;
        n[1][1]=5;
        n[1][2]=6;
        n[2][0]=7;
        n[2][1]=8;
        n[2][2]=9;

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                System.out.print(n[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length/2; j++) {
                int temp = n[i][j];
                n[i][j]=n[j][i];
                n[j][i]=temp;

            }
            System.out.println();
        }

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                System.out.print(n[i][j]);
            }
            System.out.println();
        }

    }
}
