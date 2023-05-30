import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int trials = 10000000;
        int successfulTrials = 0;
        Random rand = new Random();

        for (int i = 0; i < trials; i++) {
            double candle1 = rand.nextDouble();
            double candle2 = rand.nextDouble();
            double cut = rand.nextDouble();

            if (candle1 < cut && cut < candle2 || candle2 < cut && cut < candle1) {
                successfulTrials++;
            }
        }
        double probability = (double) successfulTrials / trials;
        System.out.println("The estimated probability is " + probability);
    }
}
