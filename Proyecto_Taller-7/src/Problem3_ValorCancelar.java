/*
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
        int i = 1, diasTrabajados;
        String name, test = "";
        Scanner sc = new Scanner(System.in);

        while (i <= 5) {
            System.out.println("Ingrese el nombre del empleado " + i + ": ");
            name = sc.next();
            System.out.println("Ingrese el numero de dias trabajados de " + name + ": ");
            diasTrabajados = sc.nextInt();
            System.out.println("Ingrese el costo por dia del empleado " + name + ": ");
            costoDia = sc.nextDouble();

            costoMes = diasTrabajados * costoDia;
            test += i + "\t" + name + "\t\t\t" + diasTrabajados + "\t\t\t\t\t$" + costoDia + "\t\t\t\t$" + costoMes + "\n";
            i++;
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.printf("N.\t%s\t\t\t%s\t\t%s\t\t%s\n", "Nombre", "Dias Trabajados", "Costo por dia", "Costo Total");
        System.out.print(test);
    }
}

/*
 * Salida de resultados
 * Ingrese el nombre del empleado 1:
 * Michael
 * Ingrese el numero de dias trabajados de Michael:
 * 21
 * Ingrese el costo por dia del empleado Michael:
 * 9
 * Ingrese el nombre del empleado 2:
 * Leonard
 * Ingrese el numero de dias trabajados de Leonard:
 * 15
 * Ingrese el costo por dia del empleado Leonard:
 * 6
 * Ingrese el nombre del empleado 3:
 * Pool
 * Ingrese el numero de dias trabajados de Pool:
 * 18
 * Ingrese el costo por dia del empleado Pool:
 * 9
 * Ingrese el nombre del empleado 4:
 * Linda
 * Ingrese el numero de dias trabajados de Linda:
 * 18
 * Ingrese el costo por dia del empleado Linda:
 * 9
 * Ingrese el nombre del empleado 5:
 * Patric
 * Ingrese el numero de dias trabajados de Patric:
 * 21
 * Ingrese el costo por dia del empleado Patric:
 * 6
 * ------------------------------------------------------------------------
 * N.	Nombre			Dias Trabajados		Costo por dia		Costo Total
 * 1	Michael			21					$9.0				$189.0
 * 2	Leonard			15					$6.0				$90.0
 * 3	Pool			18					$9.0				$162.0
 * 4	Linda			18					$9.0				$162.0
 * 5	Patric			21					$6.0				$126.0
 */
