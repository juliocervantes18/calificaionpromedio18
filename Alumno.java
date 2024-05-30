public class Alumno {
     String nombre;
     int[] calificaciones;

    public Alumno(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public static double calcularPromedio(int[] calificaciones) {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / (double) calificaciones.length;
    }

    public char calificacionFinal(double promedio) {
        if (promedio <= 50) {
            System.out.println("El promedio es " + promedio + ", su calificación final es una 'F'.");
            return 'F';
        } else if (promedio <= 60) {
            System.out.println("El promedio es " + promedio + ", su calificación final es una 'E'.");
            return 'E';
        } else if (promedio <= 70) {
            System.out.println("El promedio es " + promedio + ", su calificación final es una 'D'.");
            return 'D';
        } else if (promedio <= 80) {
            System.out.println("El promedio es " + promedio + ", su calificación final es una 'C'.");
            return 'C';
        } else if (promedio <= 90) {
            System.out.println("El promedio es " + promedio + ", su calificación final es una 'B'.");
            return 'B';
        } else {
            System.out.println("El promedio es " + promedio + ", su calificación final es una 'A'.");
            return 'A';
        }
    }

    public void imprimirResultados() {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        double promedio = calcularPromedio(calificaciones);
        char calificacionFinal = calificacionFinal(promedio);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }

    public static void main(String[] args) {
        int[] calificaciones = {80, 90, 78, 84, 90};
        Alumno alumno = new Alumno("Julio Cervantes", calificaciones);

        alumno.imprimirResultados();
    }
}
