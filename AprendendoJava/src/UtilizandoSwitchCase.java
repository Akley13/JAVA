public class UtilizandoSwitchCase {
    public static void main(String[] args) {

        int melhorJogo = 2;
        String jogos = "";

        switch (melhorJogo){
            case 1:
                jogos = "God of War";
                break;
            case 2:
                jogos = "The last of us";
                break;
            case 3:
                jogos = "Lies of P";
                break;
        }

        System.out.println("O melhor jogo é " + jogos);

    }
}
