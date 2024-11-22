/**
 * Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
 * <p>
 * Nombre el jugador
 * Posición en el campo de juego
 * Edad
 * Estatura
 * El ciclo de ingreso de información deberá terminar cuando el usuario lo decida. Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
 * <p>
 * Listado de Jugadores
 * 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 * 2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
 * 3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
 * 4. Ángel Mena -Delantero-, edad 32, estatura 1.75
 * 5. Michael Estrada -Delantero-, edad 27, estatura 1.93
 * Promedio de edades:  26.8
 * Promedio de estaturas: 1.87
 */

import java.util.Scanner;

public class Problem4_JugadoresFut {
    public static void main(String[] args) {
        String name, posicion;
        int edad, i = 1, l = 11;
        double altura;
        double promedioEdad = 0, promedioAltura = 0;
        Scanner sc = new Scanner(System.in);

        while (i <= l) {
            System.out.println("Ingrese el nombre del jugador : " + "(" + i + "/" + l + ")");
            name = sc.next();
            System.out.println("Ingrese la posición de " + name + " : ");
            posicion = sc.next();
            System.out.println("Ingrese la edad de " + name + ": ");
            edad = sc.nextInt();
            System.out.println("Ingrese la altura " + name + ": ");
            altura = sc.nextDouble();

            promedioEdad += edad;
            promedioAltura += altura;
            System.out.println("-------------------------------------------------------------------");
            System.out.printf("%s\t\t\t\t%s\t\t%s\t\t%s\n", "Nombre", "Posición", "Edad", "Altura");
            System.out.printf("%s\t\t\t\t%s\t\t\t%d años\t\t%.2fm\n", name, posicion, edad, altura);
            i++;
        }

        System.out.println("El promedio de edad es: " + promedioEdad);
        System.out.println("El promedio de altura es: " + promedioAltura);
    }
}
