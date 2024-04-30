package com.mycompany.bibliotecapoo;

public class Libro {

    private String titulo;//O(1)
    private String autor;//O(1)
    private int ano;//O(1)
    private String genero;//O(1)
    private boolean leido;//O(1)

    //Metodo Constructor
    //Complejidad temporal: O(1) Tiempo constante.
    public Libro(String titulo, String autor, int ano, String genero, boolean leido) {
        this.titulo = titulo;//O(1)
        this.autor = autor;//O(1)
        this.ano = ano;//O(1)
        this.genero = genero;//O(1)
        this.leido = false;//O(1)
    }//Cierre constructor

    //Metodo para mostrar la informacion del libro
    //Complejidad temporal: O(1) Tiempo constante.
    public String mostrarInformacion() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Año de publicación: " + ano + ", Género: " + genero;//O(1)
    }//Cierre mostrarInformacion

    //Metodo para validar el libro
    //Complejidad temporal: O(1) Tiempo constante.
    public void marcarLeido() {
        leido = true;//O(1)

    }//Cierre marcarLeido

    //Metodo para retornar el dato de marcarLeido
    //Complejidad temporal: O(1) Tiempo constante.
    public boolean isLeido() {
        return leido;//O(1)
    }//Cierre isLeido

    //Metodo para validar si es un libro antiguo
    //Complejidad temporal: O(1) Tiempo constante.
    public boolean esAntiguo() {
        if (ano < 1974) {
            return true;
        }//O(1)
        return false;//O(1)
    }//Cierre esAntiguo

    //Metodo para acceder al titulo
    //Complejidad temporal: O(1) Tiempo constante.
    public String getTitulo() {
        return titulo;
    }//Cierre getTitulo

    //Metodo para acceder al autor
    //Complejidad temporal: O(1) Tiempo constante.
    public String getAutor() {
        return autor;
    }//Cierre getAutor

    //Metodo para acceder al genero
    //Complejidad temporal: O(1) Tiempo constante.
    public String getGenero() {
        return genero;

    }//Cierre getGenero
}//Cierre class Libro
