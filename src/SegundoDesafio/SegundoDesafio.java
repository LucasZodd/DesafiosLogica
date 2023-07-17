package SegundoDesafio;

import java.text.NumberFormat;
import java.util.*;

public class SegundoDesafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        double valorEntrada = random.nextDouble() * 1000000.0;
        System.out.println("Valor de entrada: " + formatarValor(valorEntrada));

        int[] notas = { 100, 50, 20, 10, 5, 2 };
        double[] moedas = { 1, 0.50, 0.25, 0.10, 0.05, 0.01 };

        System.out.println("NOTAS:");
        for (int valorNota : notas) {
            int quantidade = calcularQuantidade(valorEntrada, valorNota);
            valorEntrada %= valorNota;
            System.out.println(quantidade + " nota(s) de R$ " + valorNota + ".00");
        }

        System.out.println("MOEDAS:");
        for (double valorMoeda : moedas) {
            int quantidade = calcularQuantidade(valorEntrada, valorMoeda);
            valorEntrada = (double) Math.round(valorEntrada % valorMoeda * 100) / 100;
            System.out.println(quantidade + " moeda(s) de R$ " + formatarValor(valorMoeda));
        }

        scanner.close();

    }

    private static int calcularQuantidade(double valorEntrada, double valor) {
        return (int) (valorEntrada / valor);
    }

    private static String formatarValor(double valor) {
        Locale locale = new Locale("en", "US");
        NumberFormat format = NumberFormat.getInstance(locale);
        return format.format(valor);
    }
}