import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);

        System.out.println("Número: ");
        var numero = inputData.nextInt();

        System.out.println("Sucessor: " + (numero + 1));
        System.out.println("Antecessor: " + (numero - 1));


    }
}
