import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int num, cont;

            System.out.println("Insira dez numeros:");
            for(cont=1;cont<=10;cont++){
                num = sc.nextInt();
                num = num+num;
                if(cont==10){
                    num = num/cont;
                    System.out.println("Media dos numeros digitados: " + num);
                }
            }
        }
    }
}
