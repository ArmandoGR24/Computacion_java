package org.example;


import java.util.Scanner;

public class Main {

    private static boolean seguir = true;


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();

        //Libros de mi biblioteca
        libros libro1 = new libros(1, "El principito", "Antoine de Saint-Exupéry");
        libros libro2 = new libros(2, "El arte de la guerra", "Sun Tzu");
        libros libro3 = new libros(3, "El señor de los anillos", "J.R.R. Tolkien");

        biblioteca.addLibro(libro1);
        biblioteca.addLibro(libro2);
        biblioteca.addLibro(libro3);

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
                        for(libros libro : biblioteca.getLibros())
                        {
                            System.out.println("ID: " + libro.getId());
                            System.out.println("Título: " + libro.getTitulo());
                            System.out.println("Autor: " + libro.getAutor());
                            System.out.println();
                        }
                        break;
                    case 2:

                        int id = biblioteca.getLibros().size() + 1;
                        sc.nextLine();
                        System.out.print("Ingrese el título del libro: ");
                        String titulo = sc.nextLine();
                        System.out.print("Ingrese el autor del libro: ");
                        String autor = sc.nextLine();

                        libros libro_add = new libros(id, titulo, autor);
                        biblioteca.addLibro(libro_add);
                        System.out.println("Libro agregado correctamente");

                        break;
                    case 3:
                        System.out.print("Ingrese el ID del libro a eliminar: ");
                        int idEliminar = sc.nextInt();
                        for(libros libro_drop : biblioteca.getLibros())
                        {
                            if(libro_drop.getId() == idEliminar)
                            {
                                biblioteca.getLibros().remove(libro_drop);
                                break;
                            }
                        }
                        System.out.println("Libro eliminado correctamente");
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