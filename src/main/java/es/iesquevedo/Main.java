package es.iesquevedo;

import es.iesquevedo.dao.ClienteRepository;
import es.iesquevedo.dao.VentaRepository;
import es.iesquevedo.dao.VideojuegoRepository;
import es.iesquevedo.modelo.Videojuego;
import es.iesquevedo.service.*;
import es.iesquevedo.ui.ControladorConsola;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import java.util.Scanner;

public class Main {
    private static final Scanner entrada = new Scanner(System.in);

    private static final VideojuegoRepository videojuegoRepository = new VideojuegoRepository();
    private static final ClienteRepository clienteRepository = new ClienteRepository();
    private static final VentaRepository ventaRepository = new VentaRepository();



    private static final VideojuegoService videojuegoService = new VideojuegoService(videojuegoRepository);
    private static final ClienteService clienteService = new ClienteService(clienteRepository);
    private static final VentaService ventasService = new VentaService (ventaRepository, videojuegoRepository, clienteRepository);


    private static final ControladorConsola controlador = new ControladorConsola(entrada, videojuegoService, clienteService, ventasService);


    public static void main(String[] args) {
        WeldContainer container = new Weld().initialize();
        ControladorConsola controller = container.select(ControladorConsola.class).get();

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



