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
public class Ejercicio4 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de kilos de manzanas que desea comprar:");
        double kilos = scanner.nextDouble();

        double precioPorKilo = 2.5; // Precio por kilo de manzanas

        double descuento = 0.0;

        if (kilos > 0 && kilos <= 2) {
            descuento = 0.0;
        } else if (kilos > 2 && kilos <= 5) {
            descuento = 0.10;
        } else if (kilos > 5 && kilos <= 10) {
            descuento = 0.15;
        } else if (kilos > 10) {
            descuento = 0.20;
        }

        double totalSinDescuento = kilos * precioPorKilo;
        double totalConDescuento = totalSinDescuento - (totalSinDescuento * descuento);

        System.out.println("Total a pagar: $" + totalConDescuento);
        }
}
