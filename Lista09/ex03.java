import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cont, breakline = 1, num = 1;
        System.out.println("Insira N: ");
        n = sc.nextInt();

        for (breakline = 1; breakline <= n; breakline++) {
            for (cont = 1; cont <= breakline; cont++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();

        }
    }
}
