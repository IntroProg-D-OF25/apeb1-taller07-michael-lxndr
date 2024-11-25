/*
 * Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de ellos ingresar el nombre del estudiante, el promedio de ciclo. Presentar el siguiente reporte
 Estudiante1 10 Aprobado
 Estudiante2 6.9 Reprobado
 Estudiante3 7  Aprobado
 Estudiante4 5  Reprobado
 * Atención; con base al valor del promedio, usted debe asignar en cada registro el tipo Aprobado o Reprobado.
 */

import java.util.Scanner;

public class Problem5_IngresarEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, pasa = "Reprobado", output = "";
        float promedio;
        int i = 1, j = 4;

        while (i <= j) {
            System.out.println("Ingrese el nombre del estudiante:   (" + i + "/" + j + ")");
            nombre = sc.next();
            System.out.println("Ingrese el promedio del estudiante " + i + ":");
            promedio = sc.nextFloat();

            if (promedio >= 7) {
                pasa = "Aprobado";
            }

            output += nombre + "\t\t" + promedio + "\t\t\t" + pasa + "\n";
            i++;
        }

        System.out.println("---------------------------------");
        System.out.printf("%s\t\t%s\t%s\n", "Nombre", "Promedio", "Estado");
        System.out.print(output);
    }
}

/*
 * Ingrese el nombre del estudiante:   (1/4)
 * Michael
 * Ingrese el promedio del estudiante 1:
 * 9
 * Ingrese el nombre del estudiante:   (2/4)
 * Leonard
 * Ingrese el promedio del estudiante 2:
 * 8
 * Ingrese el nombre del estudiante:   (3/4)
 * Pool.
 * Ingrese el promedio del estudiante 3:
 * 7
 * Ingrese el nombre del estudiante:   (4/4)
 * Linda
 * Ingrese el promedio del estudiante 4:
 * 8
 * ---------------------------------
 * Nombre		Promedio	Estado
 * Michael		9.0			Aprobado
 * Leonard		8.0			Aprobado
 * Pool.		7.0			Aprobado
 * Linda		8.0			Aprobado
 */