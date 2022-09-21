import java.util.Scanner;

public class ex20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        int par = 0, total=0;

        System.out.printf("Usuario, digite numeros inteiros, se encerra quando inserir o numero 1000: \n");
        while (num!=1000) {
            num = sc.nextInt();

            if (num % 2 == 0) {
                par++;
            }

            if(num!=1000){
            total++;
            }
        }

        System.out.printf("Usuario, inseriu %d numeros. \n", total);
        System.out.printf("Usuario, inseriu %d numeros pares. \n", par);

        sc.close();
    }

}