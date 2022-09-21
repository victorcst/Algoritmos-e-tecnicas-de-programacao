import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int num, cont;
            System.out.println("Insira um numero:");
            num = sc.nextInt();
            if(num%2!=0 && num>0 ){
                for(cont=0; cont<=num; cont++){
                    if(cont%2!=0 && num>0 ){
                    System.out.println(cont);
                    }
                }
            }else{
                System.out.println("Este numero nao e impar");
            }
        }
    }
}
