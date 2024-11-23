/**
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia: </br>
 * 5/10  </br>
 * 10/12 </br>
 * 15/14 </br>
 * 20/16 </br>
 * 25/18 </br>
 * 30/20 </br>
 */

public class Problem2_SerieNumero2 {
    public static void main(String[] args) {
        int i = 0, j = 5, k = 10;

        while (i < 6) {
            System.out.println(j + "/" + k);
            i++;
            j += 5;
            k += 2;
        }
    }
}

/*
 * Salida de resultados
 * 5/10
 * 10/12
 * 15/14
 * 20/16
 * 25/18
 * 30/20
 */