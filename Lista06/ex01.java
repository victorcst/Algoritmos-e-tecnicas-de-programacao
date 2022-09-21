import java.util.Scanner;

public class ex01{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int cont=0, num=3;

            while(cont<5){
                if(num%3==0){
                    System.out.println(num);
                    cont++;
                }
                num++;
            }
        }
    }
}