package org.example;

public class libros extends Biblioteca{

    private Integer id;
    private String Titulo;
    private String Autor;

    public libros(Integer id ,String Titulo, String Autor)
    {
        this.id = id;
        this.Titulo = Titulo;
        this.Autor = Autor;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

