package com.mycompany.bibliotecapoo;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
    
    public static void imprimirLibros(LinkedList<Libro> libros){
        for (int i = 0; i < libros.size(); i++) {
            Libro libro = libros.get(i);
            System.out.println(libro.mostrarInformacion());
        }//Cierre for
    }

    //Metodo main
    //Complejidad temporal: O(1) Tiempo constante
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca miBiblioteca = new Biblioteca();
        System.out.println("Buen dia, bienvenido a la Biblioteca");

        boolean continuar = true;

        do {
            System.out.println("");
            System.out.println("Seleccione una opcion (Numero)");
            System.out.println("1) Ingresar libro");
            System.out.println("2) Mostrar todos los libros");
            System.out.println("3) Buscar libro");
            System.out.println("4) Marcar libro como leído");
            System.out.println("5) Mostrar libros no leídos");
            System.out.println("6)Salir");
            System.out.println("");

            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Por favor ingrese el titulo del libro:");//O(1)
                    String titulo = sc.nextLine();//O(1)
                    System.out.println("Ingrese el autor del libro:");//O(1)
                    String autor = sc.nextLine();//O(1)
                    System.out.println("Ingrese el género literario del libro:");//O(1)
                    String genero = sc.nextLine();//O(1)
                    System.out.println("Ingrese el año de publicación del libro");//O(1)
                    int ano = sc.nextInt();//O(1)

                    boolean leido = false;//O(1)

                    Libro libroUsuario = new Libro(titulo, autor, ano, genero, leido);
                    miBiblioteca.registrarLibro(libroUsuario);
                    break;
                case 2:
                    LinkedList<Libro> libros = miBiblioteca.mostrarLibros();
                    imprimirLibros(libros);
                    break;
                case 3:
                    System.out.println("Ingrese su palabra de busqueda");
                    String busqueda = sc.nextLine();
                    Libro libroEncontrado = miBiblioteca.buscarLibro(busqueda);
                    System.out.println(libroEncontrado.mostrarInformacion());
                    break;
                case 4:
                    System.out.println("Ingrese el titulo del libro que desea marcar como leido");
                    String tituloMarcado = sc.nextLine();

                    Libro libroAMarcar = miBiblioteca.buscarLibro(tituloMarcado);

                    if (libroAMarcar != null) {
                        libroAMarcar.marcarLeido();
                        System.out.println("El libro " + tituloMarcado + " se ha marcado correctamente como leido.");
                    } else {
                        System.out.println("No se encontro el libro " + tituloMarcado + ".");
                    }//Cierre if
                    break;
                case 5:
                    LinkedList<Libro> librosNoLeidos = miBiblioteca.mostrarLibrosNoLeidos();
                    if (librosNoLeidos.isEmpty()) {
                        System.out.println("No hay libros sin leer");
                    } //Cierre if
                    imprimirLibros(librosNoLeidos);
                    break;
                case 6:
                    continuar = false;
                    System.out.println("Gracias por usar nuestro programa, que tenga un buen dia.");

                    break;
                default:
                    System.out.println("Opcion no valida");
            }//Cierre Switch case
        } while (continuar);
        sc.close();
    }//Cierre main

}//Cierrre Class Principal


