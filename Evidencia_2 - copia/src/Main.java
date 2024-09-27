import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("Seleccione una operación: \n 1. Sumar\n 2. Restar\n 3. Multiplicar\n 4. Dividir\n 5. Salir:");
                int operacion = Integer.parseInt(scanner.nextLine());

                if (operacion < 1 || operacion > 5) {
                    System.out.println("Operación no válida. Por favor, seleccione una opción entre 1 y 5.");
                    continue;
                }

                if (operacion == 5) {
                    continuar = false;
                    continue;
                }

                System.out.println("Ingrese el primer número:");
                int num1 = Integer.parseInt(scanner.nextLine());

                System.out.println("Ingrese el segundo número:");
                int num2 = Integer.parseInt(scanner.nextLine());

                int resultado = 0;
                switch (operacion) {
                    case 1:
                        resultado = Calculadora.sumar(num1, num2);
                        break;
                    case 2:
                        resultado = Calculadora.restar(num1, num2);
                        break;
                    case 3:
                        resultado = Calculadora.multiplicar(num1, num2);
                        break;
                    case 4:
                        resultado = Calculadora.dividir(num1, num2);
                        break;
                }

                System.out.println("El resultado es: " + resultado);
            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada no válida. Por favor, ingrese un número válido.");
            } catch (ArithmeticException e) {
                System.out.println("Error: No se puede dividir por cero.");
            } catch (Exception e) {
                System.out.println("Error: Ocurrió un problema inesperado.");
            }
        }

        scanner.close();
        System.out.println("Calculadora terminada.");
    }
}