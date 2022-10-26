/*
 *  Leonardo Avalos
 */
package ej1;

import java.text.Normalizer;
import java.util.Scanner;

public class Ej1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la palabra:");
        String cadena = sc.nextLine();

        String cadenaNormalizada = Normalizer.normalize(cadena, Normalizer.Form.NFKD);
        cadenaNormalizada = cadenaNormalizada.replaceAll("[^a-z,^A-Z,^0-9]", "");
        cadenaNormalizada = cadenaNormalizada.toLowerCase();

        StringBuilder stringbuilder = new StringBuilder(cadenaNormalizada);
        String cadenaInvertida = stringbuilder.reverse().toString();

        if (cadenaNormalizada.equals(cadenaInvertida)) {
            System.out.println("La salida para el string \"" + cadena + "\" sería: Es palíndromo");
        } else {
            System.out.println("La salida para el string \"" + cadena + "\" sería: No es palíndromo");
        }

    }
}
