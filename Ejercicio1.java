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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de computadoras que desea comprar: ");
        
        int cantidadComputadoras = scanner.nextInt();
        
        double precioUnitario = 500;
        double precioTotal = cantidadComputadoras * precioUnitario;
        double descuento = 0;
  
        
        if (cantidadComputadoras < 5) {
            descuento = 0.1 * precioTotal;
        } else if (cantidadComputadoras < 10) {
            descuento = 0.2 * precioTotal;
        } else {
            descuento = 0.4 * precioTotal;
        }
        
        double totalPago = precioTotal - descuento;
        
        System.out.println("el total de la compra es: "+ precioTotal);
        System.out.println("el descuento aplicado fue de: "+ descuento);
        System.out.println("el total a pagar es de: "+ totalPago);
    }
}
