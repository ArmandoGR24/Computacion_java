package org.example;

public class libros extends Biblioteca{

    private Integer id;
    private String Titulo;
    private String Autor;
    private int Año;

    public int getAño() {
        return Año;
    }

    public void setAño(int año) {
        Año = año;
    }

    public libros(Integer id , String Titulo, String Autor, int Año) {
        this.id = id;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Año = Año;
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

