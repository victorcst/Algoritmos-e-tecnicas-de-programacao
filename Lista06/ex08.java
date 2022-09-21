import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int num, cont;
            int maior=0, menor=0;

            System.out.println("Insira 10 numeros");
            for(cont=1; cont<=10; cont++){
                num = sc.nextInt();
                if(num>maior){
                    maior = num;
                }else if(num<menor){
                    menor = num;
                }

                if(num<0 && maior==0){
                    maior = num;
                }
            }
            System.out.println(menor +" "+ maior);
        }
    }
}
