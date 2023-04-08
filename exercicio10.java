import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a temperatura em graus Celsius: ");
            double celsius = scanner.nextDouble();

            double fahrenheit = (celsius * 9/5) + 32;

            System.out.printf("%.2f graus Celsius correspondem a %.2f graus Fahrenheit", celsius, fahrenheit);
        }
    }
}
