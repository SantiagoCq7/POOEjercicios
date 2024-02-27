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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de llantas que desea comprar: ");
        int cantidadLlantas = scanner.nextInt();
        
        double precioUnitario;
        
        if (cantidadLlantas < 5)
            precioUnitario = 100;
        else if (cantidadLlantas >= 5 && cantidadLlantas <= 10)
            precioUnitario = 75;
        else 
            precioUnitario = 50;
            
        
        double compraTotal = cantidadLlantas * precioUnitario;
        
        System.out.println("El precio de cada llanta es de: "+ precioUnitario);
        System.out.println("El precio total a pagar es de: "+ compraTotal);
    }
}
