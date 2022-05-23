import java.io.StringReader;
import java.util.Scanner;

public class Vocals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] vocals = new String[]{"a", "e", "i", "o", "u"};

//        String[] largoFrase = new String[5];
        String cadena = "sdfsadfasf";
        for (int i = 0; i < cadena.length(); i++){
            char letra = cadena.charAt(i);
            System.out.print(letra + " ");
        }



//        for (int i = 0; i < largoFrase.length; i++) {
//            System.out.println("Digues una frase");
//            frase = sc.next();
//            largoFrase[i] = frase;
//        }
//
//        for (int i = 0; i < largoFrase.length; i++) {
//            System.out.print(largoFrase[i] + " ");
//        }

        sc.close();
    }
}
