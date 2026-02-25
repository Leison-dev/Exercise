import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite sua idade em anos,meses e dias para calcular sua idade total em dias:");
            int anos = sc.nextInt();
            int meses = sc.nextInt();
            int dias = sc.nextInt();
            int idadeTotalDias = (anos * 365) + (meses * 30) + dias;
            System.out.println("Sua idade total em dias é: " + idadeTotalDias);
        }
    }
}
