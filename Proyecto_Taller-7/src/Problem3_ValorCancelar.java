/**
 * Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados. Por cada empleado se debe solicitar el nombre, número de días trabajados y costo del día trabajo. Calcular el valor a cancelar por la empresa para cada empleado. Presentar un reporte como el siguiente:
 * Nombre 1	    10	    $2.5	$25
 * Nombre 2	    11	    $2	    $22
 * Nombre 3	    9	    $3	    $27
 * Nombre 4	    5	    $4	    $20
 * Nombre 5	    12	    $2	    $24
 */

import java.util.Scanner;

public class Problem3_ValorCancelar {
    public static void main(String[] args) {
        double costoDia, costoMes;
        int i = 1, diasTrabajados = 0;
        String name;
        Scanner sc = new Scanner(System.in);

        while (i <= 5) {
            System.out.println("Ingrese el nombre del empleado " + i + ": ");
            name = sc.next();
            System.out.println("Ingrese el numero de dias trabajados: ");
            diasTrabajados = sc.nextInt();
            System.out.println("Ingrese el costo del empleado " + name + ": ");
            costoDia = sc.nextDouble();
            i++;

            costoMes = diasTrabajados * costoDia;
            System.out.println("-------------------------------------------------------------------");
            System.out.printf("%s\t\t\t%s\t\t%s\t\t%s\n", "Nombre", "Dias Trabajados", "Costo por dia", "Costo Total");
            System.out.printf("%s\t\t\t\t%d\t\t\t\t\t%.2f$\t\t\t\t%.2f$\n", name, diasTrabajados, costoDia, costoMes);
        }
    }
}
