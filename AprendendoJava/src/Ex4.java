import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex4 {
    public static void main(String[] args) {

        var valorMartelo = 10;
        var quantidadeMartelo = 3;

        var valorPrego = 5;
        var quantidadePrego = 50;

        var ipi = 0.05;

        var calculo = (double) (valorMartelo * quantidadeMartelo + valorPrego * quantidadePrego);
        var calculoIpi = (double) (valorMartelo * quantidadeMartelo + valorPrego * quantidadePrego)*(ipi/100+1);



        System.out.println("Valor total: R$ " + calculo);
        System.out.println("Valor total (com IPI): R$ " + calculoIpi);


    }
}
