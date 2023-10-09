import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        double mediaDoFilme = 0;
        double nota;

        for (int i = 1; i <= 3; i++) {
            System.out.println(i + "º Avaliação do filme");
            nota = inputData.nextDouble();
            mediaDoFilme += nota;
        }

        System.out.printf("Média das avaliações: %.1f", mediaDoFilme/3);
    }
}
