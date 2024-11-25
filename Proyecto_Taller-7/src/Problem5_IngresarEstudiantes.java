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
        String nombre, pasa = "Reprobado", out = "";
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

            out += nombre + "\t\t" + promedio + "\t\t\t" + pasa + "\n";
            i++;
        }

        System.out.print(out);
    }
}