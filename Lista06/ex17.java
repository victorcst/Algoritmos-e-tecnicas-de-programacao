import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n, cont;
            System.out.println("Insira um numero: ");
            n = sc.nextInt();
            for(cont=1; cont<=n; cont++){
                cont += cont;
            }
            System.out.println("Soma dos numeros: "+cont);
        }
    }
}
