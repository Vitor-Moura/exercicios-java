package util;

public class Ex04CurrencyConverter {

    public static double IOF = 0.06;
    public static double conversao(double cotacao, double qtdDolar) {
        return qtdDolar * cotacao * (1.0 + IOF);
    }
}
