import java.util.Scanner;

public class DesafioAlura {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        System.out.println("******************** CADASTRO ****************************");

        System.out.println("\nNome completo: ");
        String nomeCompleto = inputData.nextLine();

        String contas = """
                \nDigite o número de acordo com sua conta de preferência.
                                        
                1- Corrente
                2- Poupança
                """;

        System.out.printf(contas);

        System.out.println("\nTipo da Conta:");
        int tipoConta = inputData.nextInt();


        String contaEscolhida = switch (tipoConta) {
            case 1 -> "Corrente";
            case 2 -> "Poupança";
            default -> "Opção inválida!";
        };

        System.out.println("\nValor de depósito inicial: ");
        double saldoInicial = inputData.nextDouble();

        System.out.println("\n**********************************************************");

        System.out.println("\n******************** DADOS DO CLIENTE ********************");

        System.out.printf("\nNome completo: %s", nomeCompleto);
        System.out.printf("\nTipo de conta: %s", contaEscolhida);
        System.out.printf("\nSaldo: R$ %.2f", saldoInicial);

        System.out.println("\n\n**********************************************************");

        System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXX OPERAÇÕES XXXXXXXXXXXXXXXXXXXXXXXX");

        while (true) {

            String operacoes = """
                    \n1- Consultar saldo
                    2- Depositar valor
                    3- Transferir valor
                    4- Encerrar operações
                    """;

            System.out.println(operacoes);

            System.out.println("Digite a opção desejada");
            int opcao = inputData.nextInt();

            if (opcao == 1) {
                System.out.println("\nSaldo atualizado: " + saldoInicial);

            } else if (opcao == 2) {
                System.out.println("\nValor do depósito: R$ ");
                double valorDeposito = inputData.nextDouble();

                saldoInicial += valorDeposito;

                System.out.println("\nDepósito realizado | Saldo atualizado: R$ " + saldoInicial);

            } else if (opcao == 3) {
                System.out.println("\nValor da transferência: R$ ");
                double valorTransferencia = inputData.nextDouble();

                if (valorTransferencia > saldoInicial){
                    System.out.println("\nSaldo insuficiente | Saldo atual: R$ " + saldoInicial);
                } else {
                    saldoInicial -= valorTransferencia;
                    System.out.println("\nTransferência realizada | Saldo atualizado: R$ " + saldoInicial);
                }

            } else if (opcao == 4) {
                System.out.println("\nOPERAÇÕES ENCERRADAS");
                break;
            } else {
                System.out.println("\nOPÇÃO INVÁLIDA!");
            }
        }

        System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

    }
}
