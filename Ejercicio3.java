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
public class Ejercicio3 {


public class PrecioFinalConDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese el precio del aparato: ");
        double precioSinIVA = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("ingrese la marca del aparato: ");
        String marca = scanner.nextLine().toUpperCase();
        
        double descuentoPorPrecio = 0;
        if (precioSinIVA >= 500) {
            descuentoPorPrecio = precioSinIVA * 0.1;
        }

        double descuentoPorMarca = 0;
        if (marca.equals("NOSY")) {
            descuentoPorMarca = precioSinIVA * 0.05;
        }
        
        double precioConDescuento = precioSinIVA - descuentoPorPrecio - descuentoPorMarca;
        
        double iva = precioConDescuento * 0.19;
        
        double precioFinal = precioConDescuento + iva;
        
        System.out.println("el precio final con IVA incluido es de: "+ precioFinal);
    }
}

}
