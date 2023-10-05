public class Condicional {
    public static void main(String[] args) {
        int filmesRecentes = 2000;
        String tipoPlano = "Plus";
        boolean incluidoNoPlano = false;

        if (filmesRecentes >= 2000) {
            System.out.println("Filme recente");
        } else {
            System.out.println("Filme antigo");
        }

        if (incluidoNoPlano || tipoPlano.equals("Plus")) {
            System.out.println("AUTORIZADO A ASSISTIR");
        } else {
            System.out.println("AUTORIZAÇÃO NEGADA");
        }
    }
}
