import java.util.*;

public class Main {
    private static String Alumno;
    private static List<Double> calificaciones = new ArrayList<>();
    private static boolean continuar = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del alumno: ");
        Alumno = sc.nextLine();

        do {
            System.out.print("¿Desea ingresar una calificación? (s/n): ");
            String respuesta = sc.nextLine();
            if (respuesta.equals("s")) {
                boolean calificacionValida = false;
                while (!calificacionValida) {
                    try {
                        System.out.print("Ingrese la calificación: ");
                        double calificacion = sc.nextDouble();
                        if (calificacion < 0 || calificacion > 100) {
                            throw new IllegalArgumentException("La calificación debe estar entre 0 y 100");
                        }
                        calificaciones.add(calificacion);
                        sc.nextLine();
                        calificacionValida = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Por favor, ingrese un número.");
                        sc.next();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } else {
                continuar = false;
            }
        } while (continuar);

        try {
            Calificacíon notes = new Calificacíon();
            System.out.println("Alumno: " + Alumno);
            notes.mostrarCalificaciones(calificaciones);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}