import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite a Altura e a base do triângulo e veja sua área:");
            double altura = sc.nextDouble();
            double base = sc.nextDouble();
            double area = (base * altura) / 2;
            System.out.println("A área do triângulo é: " + area);
        }
    }
}
