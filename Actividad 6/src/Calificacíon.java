import java.util.ArrayList;
import java.util.List;

public class Calificacíon {
    List<Double> calificaciones;
    private static double promedio;

    public Calificacíon() {
    }

    public Calificacíon(ArrayList calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void promedio(List<Double> calificaciones) {
        if (calificaciones == null || calificaciones.isEmpty()) {
            throw new IllegalArgumentException("La lista de calificaciones no puede ser nula o vacía");
        }
        promedio = 0;
        for (int i = 0; i < calificaciones.size(); i++) {
            promedio += calificaciones.get(i);
        }

        promedio = promedio / calificaciones.size();
        System.out.println("El promedio es: " + promedio);
    }

    public char CalificacionFinal(double promedio) {
        if (promedio < 0 || promedio > 100) {
            throw new IllegalArgumentException("Promedio fuera de rango");
        }
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public void mostrarCalificaciones(List<Double> calificaciones) {
        if (calificaciones == null || calificaciones.isEmpty()) {
            throw new IllegalArgumentException("La lista de calificaciones no puede ser nula o vacía");
        }
        for (int i = 0; i < calificaciones.size(); i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones.get(i));
        }
        promedio(calificaciones);
        System.out.println("Calificación final: " + CalificacionFinal(promedio));
    }
}