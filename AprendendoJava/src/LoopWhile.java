import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);

        double nota = 0;
        double mediaNotas = 0;
        int totalNotas = 0;
        int contador = 1;

        while (nota != -1){
            System.out.println(contador + "° avaliação para o filme ou -1 para encerrar. ");
            nota = inputData.nextDouble();
            contador++;

            if (nota != -1) {
                mediaNotas += nota;
                totalNotas++;
            }
        }

        System.out.printf("Média Final: %.2f", mediaNotas/totalNotas);

    }
}
