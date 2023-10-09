import java.util.Scanner;

public class UtilizandoSwitchCase {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        System.out.println("QUAL O MELHOR JOGO?");

        String nomeDoJogo;

        String jogos = """
                       1- God of War
                       2- The last of us
                       3- Lies of P
                       4- Elden Ring
                       """;

        System.out.println(jogos);

        int melhorJogo = inputData.nextInt();

        nomeDoJogo = switch (melhorJogo) {
            case 1 -> "God of War";
            case 2 -> "The last of us";
            case 3 -> "Lies of P";
            case 4 -> "Elden Ring";
            default -> "OPÇÃO INVÁLIDA";
        };

        System.out.println("MELHOR JOGO DA SUA VIDA: " + nomeDoJogo);

    }
}
