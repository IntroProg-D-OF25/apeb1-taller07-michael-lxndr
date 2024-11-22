/**
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 1/10
 * 2/11
 * 3/12
 * 4/13
 * 5/14
 * 6/15
 */

import java.util.Scanner;

public class Problem1_SerieNumero1 {
    public static void main(String[] args) {
        int i = 1, j = 10;
        Scanner sc = new Scanner(System.in);

        while (i <= 6) {
            System.out.println(i + "/" + j);
            i++;
            j++;
        }
    }
}
