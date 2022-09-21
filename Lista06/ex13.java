import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int num, cont=2;

            System.out.println("Insira um numero par:");
            num = sc.nextInt();
            if(num%2==0 && num>0){
                while(cont<=num){
                    System.out.println(cont);
                    cont = cont+2;
                }
            }else{
                System.out.println("Numero inserido nao e par");
            }
        }
    }
}
