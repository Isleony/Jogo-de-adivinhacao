import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Início do jogo
        System.out.println("**Jogo de Adivinhação**");
        System.out.println("O objetivo do jogo é adivinhar um número secreto entre 0 e 100.");
        System.out.println("Você terá 5 tentativas para acertar o número.");

        // Gerando número secreto
        int numeroGerado = new Random().nextInt(100);

        // Loop principal do jogo
        int tentativas = 0;
        boolean acertou = false;
        do {
            // Pedindo palpite
            System.out.println("Digite um número entre 0 e 100: ");
            int numeroDigitado = leitor.nextInt();
            tentativas++;

            // Verificando palpite
            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                acertou = true;
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("Seu número é menor que o sorteado!");
            } else {
                System.out.println("Seu número é maior que o sorteado!");
            }
        } while (tentativas < 5 && !acertou);

        // Mensagem final
        if (!acertou) {
            System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número secreto era " + numeroGerado + ".");
        }
    }
}
