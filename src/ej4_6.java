import java.util.ArrayList;

public class ej4_6 {
    
    public static void generara(String str, String permuta, ArrayList<String> resultado) {
        if (str.isEmpty()) {
            resultado.add(permuta);
        } else {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                String aux = str.substring(0, i) + str.substring(i + 1);
                generara(aux, permuta + c, resultado);
            }
        }
        //Backtracking
    }
    public static void main(String[] args) {
        String cadena = "12345";
        ArrayList<String> resultado = new ArrayList<>();
        generara(cadena, "", resultado);
        for (String aux : resultado) {
            System.out.println(aux);
        }  
        
    }
    
}
