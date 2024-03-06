import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //adição do scanner
        Scanner scan = new Scanner(System.in);

        //loop para verificar se o usuário quer continuar testando números
        String resposta = "SIM";
        while (!resposta.equalsIgnoreCase("NÃO")) {

            System.out.println("DIGITE UMA NÚMERO E TE DIREI SE PERTENCE A SEQUENCIA DE FIBONACCI: ");
            int numero = scan.nextInt();

            //inicialização dos dois primeiros números da sequenci de fibonacci
            int primeiroNumeroFibonacci = 0;
            int segundoNumeroFibonacci = 1;

            //condições para testar se o número pertence a sequência
            if (numero == primeiroNumeroFibonacci || numero == segundoNumeroFibonacci) {
                System.out.println("SEU NÚMERO PERTENCE A SEQUÊNCIA DE FIBONACCI!");
            } else {
                boolean pertence = false;
                int numeroTemporario = primeiroNumeroFibonacci + segundoNumeroFibonacci;
                while (segundoNumeroFibonacci <= numero) {
                    if (numeroTemporario == numero) {
                        pertence = true;
                        break;
                    }
                    primeiroNumeroFibonacci = segundoNumeroFibonacci;
                    segundoNumeroFibonacci = numeroTemporario;
                    numeroTemporario = primeiroNumeroFibonacci + segundoNumeroFibonacci;
                } if (pertence) {
                    System.out.println("SEU NÚMERO PERTENCE A SEQUÊNCIA DE FIBONACCI!");
                } else {
                    System.out.println("SEU NÚMERO NÃO PERTENCE A SEQUÊNCIA DE FIBONACCI!");
                }
            }
            System.out.println("DESEJA TESTAR OUTRO NÚMERO? RESPONDA COM >SIM< PARA CONTINUAR OU >NÃO< PARA ENCERRAR");
            resposta = scan.next();
        }
        scan.close();
    }
}