import java.util.Scanner;
public class ex1{
    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
        System.out.println("Digite um valor e veja seu antecessor");
        double num = sc.nextDouble();
        double antecessor = num - 1;
        System.out.println("O antecessor de "+num+" é "+antecessor);
    }
}   
