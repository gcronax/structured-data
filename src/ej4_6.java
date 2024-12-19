public class ej4_6 {
    public static void main(String[] args) {
        String prueba="abc";
        String retorno="";
        for (int i = 0; i < prueba.length(); i++) {
            retorno+=prueba.charAt(i);
            for (int j = 0; j < prueba.length(); j++) {
                retorno+=prueba.charAt(j);
                for (int k = 0; k < prueba.length(); k++) {
                    retorno+=prueba.charAt(k);

                    System.out.println(retorno.length()==3?retorno:"");
                    
                    retorno="";
        
                }
                retorno="";
    
            }
            retorno="";

        }
        
    }
    public static void generar(String aux,String prueba){
        if (prueba.length()<=aux.length()) {
            System.out.println(aux);
        }else{
            for (int i = 0; i < prueba.length(); i++) {
                aux+=prueba.charAt(i);
                try {
                    generar(aux, prueba);
                } catch (Exception e) {
                    System.out.println(aux);
                }
                aux="";
            }
        }
    }
    
}
