import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        int tentativas = 5;
        int numeroSorteado = new Random().nextInt(100);

        while (tentativas != 0){
            System.out.println("Tentativas: " + tentativas);
            System.out.println("DIGITE UM NÚMERO ENTRE 0 E 100: ");
            int numeroDigitado = inputData.nextInt();

            if (numeroDigitado == numeroSorteado){
                System.out.println("PARABÉNS, VOCÊ GANHOU!!!");
                break;
            }

            if (numeroDigitado > numeroSorteado){
                System.out.println("O número sorteado é menor! \n");
            } else {
                System.out.println("O número sorteado é maior! \n");
            }

            tentativas -= 1;

            if (tentativas == 0){
                System.out.println("SINTO MUITO, VOCÊ PERDEU!!! \nNÚMERO SORTEADO: " + numeroSorteado);
            }
        }
    }
}
