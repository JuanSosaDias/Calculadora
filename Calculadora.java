package com.example;
//Cree esta variante para ejecutar en la terminal.
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora básica: Suma y Resta");
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el operador: ");
        char operador = scanner.next().charAt(0);

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            case '*':
                resultado = num1 * num2;
            default:
            System.out.println("Operador no válido. Usa + o -.");
                break;
        }

        System.out.println("El resultado es: " + resultado);
        scanner.close();
        
    }
}
