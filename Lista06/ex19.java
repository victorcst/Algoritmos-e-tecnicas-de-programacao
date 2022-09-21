import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num;
            int centena, dezena, unidade;

            System.out.println("Insira um numero entre 100-999: ");
            num = sc.nextInt();

            if (num >= 100 && num <= 999) {
                centena = num / 100;
                dezena = num % 100;
                unidade  = dezena;
                dezena = dezena / 10;
                unidade = unidade % 10;
                System.out.println(centena + " " + dezena + " " + unidade);
            }
        }
    }
}
