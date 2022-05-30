import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class Vocals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vocals = new String[]{"a", "e", "i", "o", "u"};

        System.out.println("Digues una frase");
        String frase = sc.nextLine();

        for (String vocal : vocals) {
            String fraseConvertida = frase.replace("a", vocal).replace("e", vocal).replace("i", vocal).replace("o", vocal).replace("u", vocal);
            System.out.println(fraseConvertida);
        }

            sc.close();
    }
}
