import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class Vocals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vocals = new String[]{"a", "e", "i", "o", "u"};

        System.out.println("Digues una frase");
        String frase;

        for (int i = 0; i < vocals.length; i++) {
            frase = sc.nextLine();
            String fraseConvertida = frase.replace("a", vocals[i]).replace("e", vocals[i]).replace("i", vocals[i]).replace("o", vocals[i]).replace("u", vocals[i]);
            System.out.println(fraseConvertida);
        }

            sc.close();
    }
}
