package biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("¡Bienvenidos al Sistema de Biblioteca!");
        System.out.println("Ingrese el nombre del usuario: ");
        String nombreUsuario = sc.nextLine();
        System.out.println("Ingrese el ID del usuario: ");
        String idUsuario = sc.nextLine();
        Usuario usuario = new Usuario(nombreUsuario, idUsuario);

        System.out.println("Ingrese el nombre del bibliotecario: ");
        String nombreBibliotecario = sc.nextLine();
        System.out.println("Ingrese el ID del bibliotecario: ");
        String idBibliotecario = sc.nextLine();
        System.out.println("Ingrese el turno del bibliotecario:");
        String turno = sc.nextLine();
        Bibliotecario bibliotecario = new Bibliotecario(nombreBibliotecario, idBibliotecario, turno);




        System.out.println("Ingrese el titulo del libro: ");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        String autor = sc.nextLine();
        System.out.println("Ingrese el ISBN del libro: ");
        String isbn = sc.nextLine();
        Libro libro = new Libro(titulo, autor,isbn);


        System.out.println("\nOpciones: ");
        System.out.println("1. Prestar libro");
        System.out.println("2. Devolver libro");
        System.out.println("3. Mostrar informacion libro");
        System.out.println("4. Salir");

        try {
            int opcion = sc.nextByte();
            switch (opcion) {
                case 1:
                    libro.prestar();
                    break;
                case 2:
                    libro.devoler();
                    break;
                case 3:
                    libro.mostrarInfo();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Error: Ingrese un numero valido:");
        }
        sc.close();
    }
}

