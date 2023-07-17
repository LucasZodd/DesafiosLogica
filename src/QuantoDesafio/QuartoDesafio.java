package QuantoDesafio;

public class QuartoDesafio {

    public static void main(String[] args) {
        String[] texto = {
                "I ENIL SIHTHSIREBBIG S",
                "H YPPAHSYADILO",
                "VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE"
        };

        int n = texto.length;
        System.out.println("Quantidade de casos de teste: " + n);

        System.out.println("Texto de entrada:");
        for (String frase : texto) {
            System.out.println(frase);
        }

        System.out.println();
        System.out.println("Frase decifrada:");
        for (int i = 0; i < n; i++) {
            String desembaralhada = desembaralharString(texto[i]);
            System.out.println(desembaralhada);
        }
    }

    private static String desembaralharString(String linha) {
        int meio = linha.length() / 2;
        StringBuilder desembaralhada = new StringBuilder();

        for (int i = meio - 1; i >= 0; i--) {
            desembaralhada.append(linha.charAt(i));
        }
        for (int i = linha.length() - 1; i >= meio; i--) {
            desembaralhada.append(linha.charAt(i));
        }

        return desembaralhada.toString();
    }
}
