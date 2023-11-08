import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        System.out.println("Informe o saldo: ");
        var saldo = inputData.nextDouble();

        saldo += 0.01;

        System.out.println("Reajuste de saldo: " + saldo);

    }
}
