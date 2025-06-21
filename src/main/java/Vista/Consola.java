package Vista;

import Controlador.JuegoDados;
import java.util.Scanner;

public class Consola {

    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        int opcion;
        do {
            mostrarOpciones();
            opcion = leerOpcion();
            if (opcion == 1) {
                jugar();
            } else if (opcion != 0) {
                System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    private void mostrarOpciones() {
        System.out.println("=== Juego de Dados ===");
        System.out.println("1. Jugar");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private int leerOpcion() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void jugar() {
        JuegoDados juego = new JuegoDados();
        juego.lanzarDados();

        int d1 = juego.getDado1();
        int d2 = juego.getDado2();
        int suma = juego.obtenerSuma();

        System.out.println("Dado 1: " + d1);
        System.out.println("Dado 2: " + d2);
        System.out.println("Suma: " + suma);

        if (juego.verificarVictoria()) {
            System.out.println("¡Ganaste! 🎉");
        } else {
            System.out.println("Perdiste 😞");
        }
    }
}
