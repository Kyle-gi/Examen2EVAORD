package es.iesquevedo;

import es.iesquevedo.ui.ControladorConsola;

import java.util.Scanner;

public class Main {
    private static final Scanner entrada = new Scanner(System.in);
    private static final ControladorConsola controlador = new ControladorConsola(entrada);

    public static void main(String[] args) {
        boolean ejecutando = true;
        while (ejecutando) {
            System.out.println("\n=== Tienda de Videojuegos ===");
            System.out.println("1) Gestión de Videojuegos");
            System.out.println("2) Gestión de Clientes");
            System.out.println("3) Gestión de Ventas");
            System.out.println("0) Salir");
            System.out.print("Seleccione opción: ");
            String opcion = entrada.nextLine().trim();
            switch (opcion) {
                case "1" -> controlador.menuVideojuegos();
                case "2" -> controlador.menuClientes();
                case "3" -> controlador.menuVentas();
                case "0" -> ejecutando = false;
                default -> System.out.println("Opción no válida");
            }
        }
        System.out.println("Hasta pronto!");
    }
}



