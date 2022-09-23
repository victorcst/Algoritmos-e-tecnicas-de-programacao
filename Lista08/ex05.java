import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num, num2;
            int x, y, xy;
            int a, b, ab;
            int maior = 0, menor = 0;

            System.out.println("Insira 2 numeros: ");
            num = sc.nextInt();
            num2 = sc.nextInt();
            if (num >= 100000 && num <= 999999 && num2 >= 100000 && num2 <= 999999) {
                x = num / 1000;
                y = num % 1000;
                xy = x * y;
                a = num2 / 1000;
                b = num2 % 1000;
                ab = a * b;

                if (xy > ab) {
                    maior = xy;
                    menor = ab;
                } else if (ab > xy) {
                    maior = ab;
                    menor = xy;
                }

                System.out.println("O maior numero palindromo feito a partir do produto dos dois numeros de 3 digitos inseridos: " + maior);
                System.out.println("O menor numero palindromo feito a partir do produto dos dois numeros de 3 digitos inseridos: " + menor);
            }
        }
    }
}
