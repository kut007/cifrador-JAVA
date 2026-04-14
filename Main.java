import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite sua frase: ");
        String frase = ler.nextLine;

        String removida = remover(frase);
        System.out.println(removida);
    }


    static String remover(frase) {
        frase = frase.toUpperCase();
        frase = frase.replace(" ", "");
        frase = frase.replace(".", "");
        frase = frase.replace(",", "");
        frase = frase.replace(";", "");
        frase = frase.replace("?", "");
        frase = frase.replace(":", "");
        frase = frase.replace("-", "");
        frase = frase.replace("Á", "A");
        frase = frase.replace("É", "E");
        frase = frase.replace("Í", "I");
        frase = frase.replace("Ó", "O");
        frase = frase.replace("Ú", "U");
        frase = frase.replace("Ç", "C");
        frase = frase.replace("Ã", "A");    
        return frase;    
    }
}