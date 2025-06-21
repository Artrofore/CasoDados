package Controlador;

import Modelo.Dado;
import Modelo.Calculadora;

public class JuegoDados {
    private Dado dado1;
    private Dado dado2;
    private Calculadora calculadora;

    public JuegoDados() {
        dado1 = new Dado();
        dado2 = new Dado();
        calculadora = new Calculadora();
    }

    public void lanzarDados() {
        dado1.lanzar();
        dado2.lanzar();
    }

    public int obtenerSuma() {
        return calculadora.sumar(dado1.getValor(), dado2.getValor());
    }

    public boolean verificarVictoria() {
        return obtenerSuma() == 7;
    }

    public int getDado1() {
        return dado1.getValor();
    }

    public int getDado2() {
        return dado2.getValor();
    }
}
