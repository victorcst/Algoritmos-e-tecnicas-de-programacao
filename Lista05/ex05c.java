import java.util.Scanner;

public class ex05c {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int limite = 0;
            int cont = 1, num = 1;
            System.out.println("Limite a sequencia: ");
            limite = sc.nextInt();
            limite = limite * 2 - 1;

            for (cont = 1; cont <= limite; cont++) {
                if(cont>1) {
                    cont++;
                    num = num+cont;
                }
                System.out.println(num);
            }
        }
    }
}
