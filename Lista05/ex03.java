import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, n;
        int res=1;
        int cb=1;

        System.out.println("Insira um número:");
        num = sc.nextInt();

        for (n = 1; n < num; n++){
            cb = n*(n+1);
            res = (res/n)*cb;
        }

        System.out.println("Resultado: " + res);
        sc.close();
    }
    
}
