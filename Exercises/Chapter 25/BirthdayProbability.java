import java.util.Scanner;

public class BirthdayProbability {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of guests: ");
        int n = input.nextInt();

        double probability = 1.0;
        for (int i = 1; i <= n; i++) {
            probability *= (365.0 - i + 1) / 365.0;
        }

        System.out.printf("The probability that none of the %d guests share a birthday is %.2f%%\n", n, probability * 100);

        double threshold = 0.5;
        int m = 0;
        probability = 1.0;
        while (probability > 1 - threshold) {
            m++;
            probability *= (365.0 - m + 1) / 365.0;
        }

        System.out.printf("It takes %d guests to have a probability of at least %.2f%% that none share a birthday.\n", m, threshold * 100);
    }
}