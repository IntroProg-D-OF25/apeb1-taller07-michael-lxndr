/*
 * Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
 * Nombre el jugador
 * Posición en el campo de juego
 * Edad
 * Estatura
 * El ciclo de ingreso de información deberá terminar cuando el usuario lo decida. Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
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

public class Problem4_JugadoresFutbol {
    public static void main(String[] args) {
        String name, posicion, salida = "";
        int edad, i = 1, j = 1;
        double altura;
        double promedioEdad = 0, promedioAltura = 0;
        Scanner sc = new Scanner(System.in);

        while (i <= j) {
            System.out.println("Ingrese el nombre del jugador:    " + "(" + i + ")");
            name = sc.next();
            System.out.println("Ingrese la posición de " + name + ":");
            posicion = sc.next();
            System.out.println("Ingrese la edad de " + name + ":");
            edad = sc.nextInt();
            System.out.println("Ingrese la altura " + name + ":");
            altura = sc.nextDouble();

            promedioEdad += edad;
            promedioAltura += altura;
            salida += name + "\t\t\t" + posicion + "\t\t" + edad + "\t\t\t" + altura + "\n";
            i++;

            System.out.println("¿Desea añadir otro jugador?   (si/no)");
            if (sc.next().equalsIgnoreCase("si")) {
                j++;
            }
        }

        System.out.println("-------------------------------------------------------");
        System.out.printf("%s\t\t\t\t%s\t\t%s\t\t%s\n", "Nombre", "Posición", "Edad", "Altura");
        System.out.print(salida);
        System.out.println("-------------------------------------------------------");
        System.out.printf("El promedio de edad es:  %.2f", promedioEdad / j);
        System.out.printf("\nEl promedio de altura es: %.2f", promedioAltura / j);
    }
}

/*
 * Salida de resultados:
 * Ingrese el nombre del jugador:    (1)
 * LeonardPM
 * Ingrese la posición de LeonardPM:
 * -Centro-
 * Ingrese la edad de LeonardPM:
 * 18
 * Ingrese la altura LeonardPM:
 * 1.75
 * ¿Desea añadir otro jugador?   (si/no)
 * si
 * Ingrese el nombre del jugador:    (2)
 * MichaelPM
 * Ingrese la posición de MichaelPM:
 * -Delantero-
 * Ingrese la edad de MichaelPM:
 * 19
 * Ingrese la altura MichaelPM:
 * 1.75
 * ¿Desea añadir otro jugador?   (si/no)
 * si
 * Ingrese el nombre del jugador:    (3)
 * Dominguez
 * Ingrese la posición de Dominguez:
 * -Arquero-
 * Ingrese la edad de Dominguez:
 * 32
 * Ingrese la altura Dominguez:
 * 1.95
 * ¿Desea añadir otro jugador?   (si/no)
 * no
 * -------------------------------------------------------
 * Nombre				Posición		Edad		Altura
 * LeonardPM			-Centro-		18			1.75
 * MichaelPM			-Delantero-		19			1.75
 * Dominguez			-Arquero-		32			1.95
 * -------------------------------------------------------
 * El promedio de edad es:  23.00
 * El promedio de altura es: 1.82
 */
