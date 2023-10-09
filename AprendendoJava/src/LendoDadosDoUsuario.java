import java.util.Scanner;

public class LendoDadosDoUsuario {
    public static void main(String[] args) {

        Scanner leituraDeDados = new Scanner(System.in);

        System.out.println("QUAL SEU JOGO FAVORITO? ");
        String jogoFavorito = leituraDeDados.nextLine();

        System.out.println("JOGO FAVORITO: " + jogoFavorito);
    }
}
