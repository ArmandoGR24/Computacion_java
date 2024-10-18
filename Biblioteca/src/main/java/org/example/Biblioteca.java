package org.example;

import java.util.HashMap;
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

}

