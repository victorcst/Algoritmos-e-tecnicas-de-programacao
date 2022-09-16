import java.util.Scanner;

public class ex05a {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int limite = 0;
            int cont = 1, num = 0;
            System.out.println("Limite a sequencia: ");
            limite = sc.nextInt();

            System.out.println("Sequencia 1");
            for (cont = 1; cont <= limite; cont++) {
                num = num + cont;
                System.out.println(num);
            }
        }
    }
}
