import java.util.Scanner;

public class ex01{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num, calc;
            System.out.println("Insira um numero:");
            num = sc.nextInt();
            
            for(calc=num; calc%11!=0 || calc%13!=0 || calc%17!=0; calc++){
                if(calc%11==0){
                    System.out.println(calc+" Numero multiplo de 11");
                    break;
                }else if(calc%13==0){
                    System.out.println(calc+" Numero multiplo de 13");
                    break;
                }else if(calc%17==0){
                    System.out.println(calc+" Numero multiplo de 17");
                    break;
                }
            }
        }
    }
}