public class ej2_4 {
    public static void main(String[] args) {
        int[][] n=new int[3][3];
        n[0][0]=1;
        n[0][1]=2;
        n[0][2]=3;
        n[1][0]=4;
        n[1][1]=5;
        n[1][2]=6;
        n[2][0]=70;
        n[2][1]=8;
        n[2][2]=9;
        int max=0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                if(n[i][j]>max){
                    max=n[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
