import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0, between1=0, between2=0, between3=0, between4=0;;
        do{
            System.out.println("Digite um número:");
            num = sc.nextInt();
            if(num>=0 && num<25){
                between1++;
            }
            else if(num>=26 && num<=50){
                between2++;
            }
            else if(num>=51 && num<=75){
                between3++;
            }
            else if(num>=76 && num<=100){
                between4++;
            }
        }while(num>=0);

        System.out.println(between1+" números entre 0~25");
        System.out.println(between2+" números entre 26~50");
        System.out.println(between3+" números entre 51~75");
        System.out.println(between4+" números entre 76~100");
        sc.close();
    }
    
}
