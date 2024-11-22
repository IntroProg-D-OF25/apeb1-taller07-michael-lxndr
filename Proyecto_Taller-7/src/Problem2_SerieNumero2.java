/***
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 	5/10
 * 	10/12
 * 	15/14
 * 	20/16
 * 	25/18
 * 	30/20
 */

import java.util.Scanner;

public class Problem2_SerieNumero2 {
    public static void main(String[] args) {
        int i = 0, j = 5, k = 10;
        Scanner sc = new Scanner(System.in);

        while (i < 6) {
            System.out.println(j + "/" + k);
            i++;
            j += 5;
            k += 2;
        }
    }
}
