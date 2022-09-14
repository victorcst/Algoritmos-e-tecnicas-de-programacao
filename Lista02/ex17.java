import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, dif=0;
        
        while(dif>=0){
            System.out.println("Insira 2 numeros:");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            if(num1>num2){
                dif = num1-num2;
                System.out.println(num1+" e maior, e a diferenca entre eles e: "+dif);
            }
            if(num2>num1){
                dif = num2-num1;
                System.out.println(num2+" e maior, e a diferenca entre eles e: "+dif);
            }
        }
        sc.close();
    }
}
