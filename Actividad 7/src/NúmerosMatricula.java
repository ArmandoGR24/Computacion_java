import java.util.Scanner;

public class NúmerosMatricula {
    private static Scanner sc = new Scanner(System.in);
    private static int num;

    public static void main(String[] args) {
        System.out.println("Numeros en While");
        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println("Ingrese un numero mayor o igual a cero:");
            num = sc.nextInt();
        } while (num < 0);

        System.out.println("El numero ingresado es: " + num);

        System.out.println("Numeros en For");
        for (int j = 0; j <= 100; j++) {
            System.out.println(j);
        }

        printNums();
    }

    public static void printNums() {
        System.out.println("Numeros divisibles entre 2 y 3");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}