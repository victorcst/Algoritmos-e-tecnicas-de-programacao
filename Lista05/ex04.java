import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            float num = 2, res = 1, mult = 1, i = 1, s = 0;
            int serieTamanho;

            System.out.println("Insira o tamanho da serie: ");
            serieTamanho = sc.nextInt(); //Pedido pelo exercicio serie com 5 termos

            while (mult < num && num < serieTamanho) {
                res = res + (res * mult);
                mult++;
                num = num + 2;
                if (num < 8) {
                    s = s + (i / res);
                }
            }

            System.out.println(res);
        }
    }
}
