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
public class Ejercicio6 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad en años: ");
        int edad = scanner.nextInt();

        System.out.println("Ingrese su sexo (M para masculino, F para femenino): ");
        char sexo = scanner.next().charAt(0);

        System.out.println("Ingrese su nivel de hemoglobina en g%: ");
        double nivelHemoglobina = scanner.nextDouble();

        boolean tieneAnemia = tieneAnemia(edad, sexo, nivelHemoglobina);

        if (tieneAnemia) {
            System.out.println("Usted tiene anemia.");
        } else {
            System.out.println("Usted no tiene anemia.");
        }
    }

    public static boolean tieneAnemia(int edad, char sexo, double nivelHemoglobina) {
        if (edad <= 0) {
            return false; 
        }

        if (sexo == 'M' || sexo == 'm') {
            if (edad <= 1) {
                return nivelHemoglobina < 13 || nivelHemoglobina > 26;
            } else if (edad <= 6) {
                return nivelHemoglobina < 10 || nivelHemoglobina > 18;
            } else if (edad <= 12) {
                return nivelHemoglobina < 11 || nivelHemoglobina > 15;
            } else if (edad <= 60) { 
                return nivelHemoglobina < 14 || nivelHemoglobina > 18;
            } else {
                return nivelHemoglobina < 12 || nivelHemoglobina > 16;
            }
        } else if (sexo == 'F' || sexo == 'f') {
            if (edad <= 1) {
                return nivelHemoglobina < 13 || nivelHemoglobina > 26;
            } else if (edad <= 6) {
                return nivelHemoglobina < 10 || nivelHemoglobina > 18;
            } else if (edad <= 12) {
                return nivelHemoglobina < 11 || nivelHemoglobina > 15;
            } else if (edad <= 60) { 
                return nivelHemoglobina < 12 || nivelHemoglobina > 16;
            } else {
                return nivelHemoglobina < 12 || nivelHemoglobina > 16;
            }
        } else {
            return false; 
        }
    }
    
}
