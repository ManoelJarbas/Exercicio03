import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite o Primeiro número: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        System.out.println("Digite o Segundo número: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;
        System.out.println("A soma dos números digitados é: " + soma);

    }
}
