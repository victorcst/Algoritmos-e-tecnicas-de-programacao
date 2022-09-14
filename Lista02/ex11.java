import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade=0;

        System.out.println("Insira idade:");
        idade = sc.nextInt();

        if(idade>=5 && idade<=7){
            System.out.println("Infantil A");
        }else if(idade>=8 && idade<=10){
            System.out.println("Infantil B");
        }else if(idade>=11 && idade<=13){
            System.out.println("Juvenil A");
        }else if(idade>=14 && idade<=17){
            System.out.println("Juvenil B");
        }else if(idade>=18){
            System.out.println("Senior");
        }
        sc.close();
    }
}
