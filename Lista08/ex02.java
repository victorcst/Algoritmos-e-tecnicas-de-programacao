import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a, b;
            int n, somaN=0;
            int aux, resDiv, countRes = 0;
            System.out.println("Insira 2 numeros: ");
            a = sc.nextInt();
            b = sc.nextInt();

            if (a < b) {
                if (a > 1) {
                    for (n = a; n <= b; n++) {
                        for (aux = 2; aux < (n - 1); aux++) {
                            resDiv = n % aux;
                            if (resDiv == 0) {
                                countRes++;
                            }
                        }
                        if (countRes == 0) {
                            somaN += n;
                            System.out.println(somaN);
                        }
                        countRes = 0;
                    }
                }
            } else if (b < a) {
                if (b > 1) {
                    for (n = b; n <= a; n++) {
                        for (aux = 2; aux < (n - 1); aux++) {
                            resDiv = n % aux;
                            if (resDiv == 0) {
                                countRes++;
                            }
                        }
                        if (countRes == 0) {
                            somaN += n;
                            System.out.println(somaN);
                        }
                        countRes = 0;
                    }
                }
            }
        }
    }
}