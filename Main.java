import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite sua frase: ");
        String frase = ler.nextLine();

        String removida = remover(frase);
        String cifrada = cifrar(removida, 5);
        System.out.println(cifrada);
    }


    static String remover(String frase) {
        frase = frase.toUpperCase();
        frase = frase.replace(" ", "");
        frase = frase.replace(".", "");
        frase = frase.replace(",", "");
        frase = frase.replace(";", "");
        frase = frase.replace("?", "");
        frase = frase.replace(":", "");
        frase = frase.replace("-", "");
        frase = frase.replace("_", "");
        frase = frase.replace("!", "");
        frase = frase.replace("Á", "A");
        frase = frase.replace("É", "E");
        frase = frase.replace("Í", "I");
        frase = frase.replace("Ó", "O");
        frase = frase.replace("Ú", "U");
        frase = frase.replace("Ç", "C");
        frase = frase.replace("Ã", "A");    
        return frase;    
    }
    static String cifrar(String removida, int pular) {
        int tamanho = removida.length();
        char[] resultado = new char[tamanho];
        int sla = 0;

        for (int i = 0; i < tamanho; i++) {
            resultado[i] = removida.charAt(sla);
            sla = (sla + pular) % tamanho;
        }
        return new String (resultado);
    }
}