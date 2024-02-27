/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosdepractica;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Ejercicio5 {
    public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar el saldo actual
        System.out.print("Ingrese el saldo actual: ");
        double saldoActual = scanner.nextDouble();

        double prestamo = 0;
        double equipoComputo = 5000;
        double mobiliario = 2000;
        double insumos;
        double incentivos;

        // Verificar si se necesita solicitar un préstamo y ajustar el saldo actual
        if (saldoActual < 0) {
            prestamo = 10000 - saldoActual;
            saldoActual = 10000;
        } else if (saldoActual < 20000) {
            prestamo = 20000 - saldoActual;
            saldoActual = 20000;
        }

        // Calcular las cantidades para insumos e incentivos
        double resto = saldoActual - equipoComputo - mobiliario;
        insumos = resto / 2;
        incentivos = resto - insumos;

        // Mostrar resultados
        System.out.println("Cantidad destinada para equipo de computo: U$" + equipoComputo);
        System.out.println("Cantidad destinada para mobiliario: U$" + mobiliario);
        System.out.println("Cantidad destinada para insumos: U$" + insumos);
        System.out.println("Cantidad destinada para incentivos al personal: U$" + incentivos);

        if (prestamo > 0) {
            System.out.println("Se solicitará un préstamo de U$" + prestamo + " al banco.");
        } else {
            System.out.println("No es necesario solicitar un préstamo al banco.");
        }
    }

}
