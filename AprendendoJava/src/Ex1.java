import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        var meses = 12;
        var diasDoAno = 365;

        System.out.println("Sua idade? ");
        var idade = inputData.nextInt();

        System.out.println("\nIdade: " + idade + " anos");
        System.out.println("Idade em meses: " + idade*meses + " meses");
        System.out.println("Idade em dias: " + idade*diasDoAno + " dias");

    }
}
