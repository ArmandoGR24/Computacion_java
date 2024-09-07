package org.ArmandoGR;

import java.util.Scanner;

//Armando Gonzalez De La Rosa
//AL03069543

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double peso, altura, imc;

        System.out.println("Calculadora de IMC");
        System.out.print("Digita tu peso en Kg: ");
        peso = scanner.nextDouble();
        System.out.print("Digita tu altura en metros: ");
        altura = scanner.nextDouble();
        imc = peso / (altura * altura);
        System.out.printf("Tu IMC es %.2f\n", imc);
    }
}