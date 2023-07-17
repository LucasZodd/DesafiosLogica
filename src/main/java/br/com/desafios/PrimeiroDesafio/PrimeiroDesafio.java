package main.java.br.com.desafios.PrimeiroDesafio;

import java.util.*;

public class PrimeiroDesafio {

    public static void main(String[] args) {
        Random random = new Random();
        int n = 11;

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        List<Integer> valorEntrada = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int valor = random.nextInt(100);
            if (valor % 2 == 0) {
                pares.add(valor);
                valorEntrada.add(valor);
            } else {
                impares.add(valor);
                valorEntrada.add(valor);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        System.out.println("Valores de entrada:");
        for (int valor : valorEntrada) {
            System.out.println(valor);
        }

        System.out.println("Valores de saida:");
        for (int par : pares) {
            System.out.println(par);
        }
        for (int impar : impares) {
            System.out.println(impar);
        }
    }
}