package com.mycompany.bibliotecapoo;

import java.util.LinkedList;

public class Biblioteca {

    private LinkedList<Libro> libros;
    
    //Constructor
    //Complejidad temporal: O(1) Tiempo constante.
    public Biblioteca() {
        this.libros = new LinkedList<>();
    }//Cierre constructor
    
    //Metodo para agregar libros a la biblioteca
    //Complejidad temporal: O(1) Tiempo constante
    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }//Cierre Registrar Libros

    //Metodo para buscar libros en la biblioteca
    //Complejidad lineal: O(N) Tiempo lineal.
    public Libro buscarLibro(String palabraBusqueda) {
        for (int i = 0; i < libros.size(); i++) {
            Libro libroVisitado = libros.get(i);
            if (libroVisitado.getTitulo().contains(palabraBusqueda) || libroVisitado.getAutor().contains(palabraBusqueda) || libroVisitado.getGenero().contains(palabraBusqueda)) {
                System.out.println(libroVisitado.mostrarInformacion());
                return libroVisitado;
            }//Cierre if
        }//Cierre for
        return null;
    }//Cierre class palabraBusqueda
    
    //Metodo para mostrar los libros que hay en la biblioteca
    //Complejidad lineal: O(N) Tiempo lineal.
    public String mostrarLibros() {
        for (int i = 0; i < libros.size(); i++) {
            Libro libro = libros.get(i);
            System.out.println(libro.mostrarInformacion());
        }//Cierre for
        return libros.toString();
    }//Cierre mostrarLibros

    //Metodo para mostrar los libros que no estan marcados como leidos en la biblioteca
    //Complejidad lineal: O(N) Tiempo lineal.
    public String mostrarLibrosNoLeidos() {
        LinkedList<Libro> librosNoLeidos = new LinkedList<>();
        for (int i = 0; i < libros.size(); i++) {
            Libro libroBuscado = libros.get(i);
            if (libroBuscado.isLeido()==false) {
                librosNoLeidos.add(libroBuscado);
                System.out.println(libroBuscado.mostrarInformacion());
            } //Cierre if
        }//Cierre for
        if (librosNoLeidos.isEmpty()) {
            System.out.println("No hay libros sin leer");
        } //Cierre if
        return "Ingrese el nombre del libro correctamente";
    }//mostrarLibroNoLidos

}//Cierre Class Biblioteca

