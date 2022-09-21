import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int num, cont;

            System.out.println("Insira um numero par:");
            num = sc.nextInt();
            cont = num;
            if(num%2==0 && num>0){
                num = 0;
                while(cont>=num){
                    System.out.println(cont);
                    cont = cont-2;
                }
            }else{
                System.out.println("Numero inserido nao e par");
            }
        }
    }
}
