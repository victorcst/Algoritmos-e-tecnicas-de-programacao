import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = 0, cont;

            for (cont = 0; cont < 10; cont++) {
                System.out.println("Insira um numero:");
                num = sc.nextInt();
                num = num + num;
            }
            System.out.println(num + " total da soma dos numeros");
        }
    }
}
