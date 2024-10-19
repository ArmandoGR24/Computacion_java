package org.example;


import java.util.Scanner;

public class Main {

    private static boolean seguir = true;


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();

        //Libros de mi biblioteca
        libros libro1 = new libros(1, "El principito", "Antoine de Saint-Exupéry", 1943);
        libros libro2 = new libros(2, "Cien años de soledad", "Gabriel García Márquez", 1967);
        libros libro3 = new libros(3, "Orgullo y prejuicio", "Jane Austen", 1813);
        libros libro4 = new libros(4, "El señor de los anillos", "J.R.R. Tolkien", 1954);

        biblioteca.addLibro(libro1);
        biblioteca.addLibro(libro2);
        biblioteca.addLibro(libro3);
        biblioteca.addLibro(libro4);

        try {
            while(seguir)
            {
                System.out.println("1. Mostrar libros");
                System.out.println("2. Agregar libros");
                System.out.println("3. Eliminar libros");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");

                int opcion = sc.nextInt();

                switch(opcion)
                {
                    case 1:
                        biblioteca.mostrar_libros();
                        break;
                    case 2:

                        int id = biblioteca.getLibros().size() + 1;
                        sc.nextLine();
                        System.out.print("Ingrese el título del libro: ");
                        String titulo = sc.nextLine();
                        System.out.print("Ingrese el autor del libro: ");
                        String autor = sc.nextLine();
                        System.out.print("Ingrese el año del libro: ");
                        int año = sc.nextInt();

                        libros libro_add = new libros(id, titulo, autor,año);
                        biblioteca.addLibro(libro_add);
                        System.out.println("Libro agregado correctamente");

                        break;
                    case 3:
                        System.out.print("Ingrese el ID del libro a eliminar: ");
                        int idEliminar = sc.nextInt();
                        biblioteca.drop_libros(idEliminar);
                        break;

                    case 4:
                        System.out.println("Hasta luego :)");
                        seguir = false;
                        break;

                    default:
                        System.out.println("Opción no válida");
                        break;


                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }

    }
}