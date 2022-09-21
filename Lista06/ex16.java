import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int num, cont;
            System.out.println("Insira um numero:");
            num = sc.nextInt();
            cont = num;
            if(num%2!=0 && num>0 ){
                num=0;
                while(cont>=num){
                    if(cont%2!=0 && cont>0 ){
                    System.out.println(cont);
                    }
                    cont--;
                }
            }else{
                System.out.println("Este numero nao e impar");
            }
        }
    }
}
