package org.example;

import java.util.LinkedList;
import java.util.List;

public class Biblioteca {

    private List<libros> libros;

    public Biblioteca()
    {
        libros = new LinkedList<libros>();
    }

    public void addLibro(libros libro)
    {
        libros.add(libro);
    }

    public List<libros> getLibros()
    {
        return libros;
    }

    public void mostrar_libros()
    {
        for(libros libro : getLibros())
        {
            System.out.println("ID: " + libro.getId());
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Año: " + libro.getAño());
            System.out.println();
        }
    }

    public void drop_libros(int id)
    {
        for(libros libro_drop : getLibros())
        {
            if(libro_drop.getId() == id)
            {
                getLibros().remove(libro_drop);
                break;
            }
        }
        System.out.println("Libro eliminado correctamente");
    }
}


