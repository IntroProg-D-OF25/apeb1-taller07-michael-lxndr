/*
 * Generar e imprimir la siguiente serie:
 * sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 */

public class Problem7_GenereImprima {
    public static void main(String[] args) {
        String output = "", signo;
        int i = 0, j = 10;

        while (i < j) {
            i++;

            if (i % 2 == 0) {
                signo = "+";
            } else {
                signo = "-";
            }

            output += signo + "(" + 1 + "/" + i + ")";
        }

        System.out.println("sumatoria = " + output);
    }
}

/*
 * Salida de resultados
 * sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 */