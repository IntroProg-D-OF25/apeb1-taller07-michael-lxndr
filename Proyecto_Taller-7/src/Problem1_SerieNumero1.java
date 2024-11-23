/**
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia: </br>
 * 1/10 </br>
 * 2/11 </br>
 * 3/12 </br>
 * 4/13 </br>
 * 5/14 </br>
 * 6/15 </br>
 */

public class Problem1_SerieNumero1 {
    public static void main(String[] args) {
        int i = 1, j = 10;

        while (i <= 6) {
            System.out.println(i + "/" + j);
            i++;
            j++;
        }
    }
}

/*
 * Salida de resultados
 * 1/10
 * 2/11
 * 3/12
 * 4/13
 * 5/14
 * 6/15
 */