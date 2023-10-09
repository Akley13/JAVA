public class DesafioConversaoDeTemperatura {
    public static void main(String[] args) {

        int temperaturaCelsius = 10;

        int calculo = (int) ((temperaturaCelsius * 1.8) + 32); // O resultado deste cálculo seria um double, utilizei um cast
                                                            // (int) para mostrar o resultado como inteiro.
        System.out.printf("FAHRENHEIT: %d", calculo);

    }
}
