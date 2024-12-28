public class ej4_5 {
    public static void main(String[] args) {
        String palabra1="hola";
        String palabra2="hloa";
        int n=0;
        //the 2 words need to have the same lenght  :(
        for (int i = 0; i < palabra1.length(); i++) {
            for (int j = 0; j < palabra2.length(); j++) {
                if (palabra1.charAt(i)==palabra2.charAt(j)) {
                    n++;
                }
            }
        }
        System.out.println(n==palabra1.length()?"si":"no");


    }
    
    
    
}
