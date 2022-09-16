import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = 0, denominador;
        float res = 1;

        System.out.println("Insira um número:");
        num = sc.nextFloat();

        for (denominador = 2; denominador <= num; denominador++) {
            res = res + (1 / denominador);
            System.out.println(res);
        }

        System.out.println("Número harmônico: " + res);
        sc.close();
    }
}