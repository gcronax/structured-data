public class ej4_4 {
    public static void main(String[] args) {
        String prueba="qwertyuiiiiioopdddfvv";
        prueba+=" ";
        String retorno="";
        char letra=' ';
        int count=1;
        for (int i = 0; i < prueba.length()-1; i++) {
            if (prueba.charAt(i)==prueba.charAt(i+1)) {
                count++;
            }else{
                retorno+=prueba.charAt(i)+Integer.toString(count);
                count=1;
            }
        }
        System.out.println(retorno);
    }
    
}
