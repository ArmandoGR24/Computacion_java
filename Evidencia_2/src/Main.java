import java.util.Scanner;

public class Main {
    private static double resultado;
    private static int operacion;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            clearScreen();
            System.out.println("Calculadora Basica");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");

            try {
                System.out.print("Seleccione una operacion: ");
                operacion = sc.nextInt();

                switch (operacion) {
                    case 1:
                        System.out.println("Ingrese el primer valor: ");
                        double valor1 = sc.nextDouble();
                        System.out.println("Ingrese el segundo valor: ");
                        double valor2 = sc.nextDouble();
                        resultado = suma(valor1, valor2);
                        System.out.println("El resultado de la suma es: " + resultado);
                        break;
                    case 2:
                        System.out.println("Ingrese el primer valor: ");
                        valor1 = sc.nextDouble();
                        System.out.println("Ingrese el segundo valor: ");
                        valor2 = sc.nextDouble();
                        resultado = resta(valor1, valor2);
                        System.out.println("El resultado de la resta es: " + resultado);
                        break;
                    case 3:
                        System.out.println("Ingrese el primer valor: ");
                        valor1 = sc.nextDouble();
                        System.out.println("Ingrese el segundo valor: ");
                        valor2 = sc.nextDouble();
                        resultado = multiplicacion(valor1, valor2);
                        System.out.println("El resultado de la multiplicacion es: " + resultado);
                        break;
                    case 4:
                        System.out.println("Ingrese el primer valor: ");
                        valor1 = sc.nextDouble();
                        System.out.println("Ingrese el segundo valor: ");
                        valor2 = sc.nextDouble();
                        resultado = division(valor1, valor2);
                        System.out.println("El resultado de la division es: " + resultado);
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        return;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }

                System.out.println("Presione Enter para continuar...");
                sc.nextLine();
                sc.nextLine();


            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());

            }
        }
    }

    public static void clearScreen() {
        for (int i = 0; i < 50; ++i) System.out.println();
    }

    public static double suma(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public static double resta(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public static double multiplicacion(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public static double division(double valor1, double valor2) {
        return valor1 / valor2;
    }
}