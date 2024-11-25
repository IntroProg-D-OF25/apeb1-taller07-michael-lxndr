/*
 * Una empresa de comercialización de computadoras realiza el proceso de venta haciendo un descuento por tipo de cliente:
 * Si es cliente tipo 1 hay un descuento del 10%
 * Si es cliente tipo 2 hay un descuento del 20%
 * En caso de que sea otro tipo de cliente, no hay descuento.
 * Generar un proceso que permita ingresar 7 ventas: por cada venta preguntar los siguientes datos:
 * Nombre del cliente
 * Costo de la computadora (solo se vende una computadora por transacción)
 * Tipo de cliente
 * Presentar el siguiente reporte:
 * Cliente tipo 1, compra computadora con precio $100
 */

import java.util.Scanner;

public class Problem6_VentaDescuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cliente, tipoCli, out = "";
        double costoPC, descuento;
        int i = 1, j = 7;

        while (i <= j) {
            System.out.println("Ingrese el nombre del cliente: ");
            cliente = sc.next();
            System.out.println("Ingrese el costro de la computadora: ");
            costoPC = sc.nextDouble();
            System.out.println("Ingrese el tipo de cliente:    (1||2)");
            tipoCli = sc.next();

            descuento = costoPC * 0.9;
            if (tipoCli.equals("2")) {
                descuento = costoPC * 0.8;
            }
            out += cliente + "\t\t\t\t\t\t\tTipo " + tipoCli + "\t\t\t\t\t$" + descuento + "\n";
            i++;
        }
        System.out.print("Nombre del cliente: " + "\t\t" + "Tipo de cliente" + "\t\t\t" + "Precio con descuento\n");
        System.out.print(out);
    }
}
