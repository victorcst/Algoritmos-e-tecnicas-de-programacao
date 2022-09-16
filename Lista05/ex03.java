import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float num = 0, res = 1, cb = 1, n, quest=1;

            System.out.println("Insira um número:");
            num = sc.nextFloat();

            for (n = 1; n < num; n++) {
                if(n<num){
                    quest += (1 / res);
                }

                cb = n * (n + 1);
                res = (res / n) * cb;

            }

            System.out.println("Resultado: " + quest);
        }
    }

}