public class Variaveis {
    public static void main(String[] args) {

        System.out.println("SCREEN MATCH");

        System.out.println("Filme: Efeito borboleta");

        int anoEfeitoBorboleta = 2004;
        System.out.println("Ano de lançamento: " + anoEfeitoBorboleta);

        double notaDoFilme = 9.8;
        System.out.println("Nota: " + notaDoFilme);

        boolean planoAssinatura = true;
        System.out.println("Plano: " + planoAssinatura);

        double mediaDoFilme = (9.8 + 7.0 + 8.0) / 3;
        System.out.printf("Média do filme: %.2f \n", mediaDoFilme);

        // String sinopse = "Filme de suspense, estrelando com Asthon kutcher";

        String sinopse = """
                         Filme de suspense
                         Estrelando Ashton Kutcher
                         """;

        System.out.print(sinopse);

        double classificacao = mediaDoFilme / 2;
        System.out.printf("Classificação Geral: %.2f", classificacao);


    }
}
