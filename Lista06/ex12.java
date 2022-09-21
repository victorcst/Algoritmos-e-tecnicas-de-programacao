import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int num, cont;

            System.out.println("Insira um numero:");
            num = sc.nextInt();
            for(cont = 0; cont<=num; cont++){
                System.out.println(cont);
            }
        }
    }
}
