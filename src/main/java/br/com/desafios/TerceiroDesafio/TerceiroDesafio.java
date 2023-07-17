package main.java.br.com.desafios.TerceiroDesafio;

import java.util.*;

public class TerceiroDesafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array (n): ");
        int n = scanner.nextInt();

        System.out.print("Digite o valor alvo (K): ");
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int numeroDePares = contarParesComDiferencaAlvo(arr, k);
        System.out.println("Número de pares com diferença igual a " + k + ": " + numeroDePares);

        scanner.close();
    }

    private static int contarParesComDiferencaAlvo(int[] arr, int k) {
        Arrays.sort(arr);
        int contador = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] == k) {
                    contador++;
                } else if (arr[j] - arr[i] > k) {
                    break;
                }
            }
        }

        return contador;
    }
}