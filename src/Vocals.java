import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class Vocals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //STRING PER ESCRIURE LES LLETRES QUE SUSTITUIRAN A LES ALTRES
        String[] vocals = new String[]{"a", "e", "i", "o", "u"};

        //ESCRIVIM UNA FRASE
        System.out.println("Digues una frase");
        String frase = sc.nextLine();

        //CREEM UN FOR PER A QUE CADA VOLTA (ITERACIO) QUE FACI, CANVII LES LLETRES QUE DEMANEM PER LA LLETRA
        //QUE HI HAGI A LA POSICIO DE L'STRING-ARRAY CREAT ABANS
        for (String vocal : vocals) {

            //Amb els parentesis '[]' especifiquem que volem reemplaçar totes les lletres que hi hagi dins d'ells,
            //per per separat. Si escrivissim només "aeiou", buscaria dins el text exactament aeiou, cosa que no funcionaria
            //pero al fer "[aeiou]", buscara la a e i o u per separat i les reemplaçara per el que indiquem.
            //Aquest metode nomes funciona si volem canviar lletres
            String novaFrase = frase.replaceAll("[aeiou]", vocal);
            System.out.println(novaFrase);
        }

            sc.close();
    }
}
