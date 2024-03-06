import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //adicionado o scanner para leitura da palavra digitada pelo usuário
        Scanner scan = new Scanner(System.in);

        //solicitando a palavra e sanvalndo no scan
        System.out.println("DIGITE UMA PALAVRA: ");
        String palavra = scan.next();

        //invertendo a palavra utilizando o métodogit add . inverterPalavra e imprimindo no console
        String palavraInvertida = inverterPalavra(palavra);
        System.out.println("Sua palavra invertida fica: " + palavraInvertida);
    }

    //utilizado o for para percorrer a palavra e adicionado o StringBuilder para manipular a string
    public static String inverterPalavra(String palavra) {
        StringBuilder palavraInvertida = new StringBuilder();
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida.append(palavra.charAt(i));
        }
        return palavraInvertida.toString();
    }
}
