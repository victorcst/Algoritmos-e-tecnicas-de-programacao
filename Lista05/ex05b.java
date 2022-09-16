import java.util.Scanner;

public class ex05b {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int limite = 0;
            int cont = 1, num = 0;

            System.out.println("Sequencia 2");
            limite = limite * 2 - 1;
            cont = 1;
            num = 1;
            for (cont = 1; cont <= limite; cont++) {
                if (cont % 2 != 0) {
                    num = num - cont;
                } else {
                    num = num + cont;
                }
                System.out.println(num);
            }
        }
    }
}
