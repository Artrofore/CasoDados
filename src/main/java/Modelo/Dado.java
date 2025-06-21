package Modelo;

import java.util.Random;

public class Dado {
    private int valor;
    private Random random;

    public Dado() {
        random = new Random();
    }

    public void lanzar() {
        valor = random.nextInt(6) + 1;
    }

    public int getValor() {
        return valor;
    }
}
