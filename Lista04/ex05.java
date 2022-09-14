import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num=0;
        int cont=0;

        do{
            System.out.println("Insira um número:");
            num  = sc.nextFloat();
            cont++;
        }while(num>0);
        cont--;
        System.out.println("Foram digitados: "+cont+" números positivos.");
        sc.close();
    }
    
}
