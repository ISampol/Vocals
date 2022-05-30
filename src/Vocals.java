import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class Vocals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digues una frase");
        String frase = sc.nextLine();

        if (frase.contains("a") || frase.contains("e") || frase.contains("i") || frase.contains("o") || frase.contains("u")){
            String fraseA = frase.replace("e", "a").replace("i", "a").replace("o","a").replace("u", "a");
            String fraseE = frase.replace("a", "e").replace("i", "e").replace("o","e").replace("u", "e");
            String fraseI = frase.replace("a", "i").replace("e", "i").replace("o","i").replace("u", "i");
            String fraseU = frase.replace("a", "o").replace("e", "o").replace("i","o").replace("u", "o");
            String fraseO = frase.replace("a", "u").replace("e", "u").replace("i","u").replace("o", "u");

            System.out.println(fraseA);
            System.out.println(fraseE);
            System.out.println(fraseI);
            System.out.println(fraseO);
            System.out.println(fraseU);
        }

            sc.close();
    }
}
