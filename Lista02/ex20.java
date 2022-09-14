import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double imc=0, peso=0, altura=0;
        
        while(peso>=0){
            System.out.println("Insira altura");
            altura = sc.nextDouble();
            System.out.println("Insira peso:");
            peso = sc.nextDouble();
            imc = peso/(altura*altura);
            if(imc<=18.5){
                System.out.println("Abaixo do peso");
            }else if(imc>=18.6 && imc<=24.9){
                System.out.println("Saudavel");
            }else if(imc>=25 && imc<=29.9){
                System.out.println("Peso em excesso");
            }else if(imc>=30 && imc<=34.9){
                System.out.println("Obesidade GRAU I");
            }else if(imc>=35 && imc<=39.9){
                System.out.println("Obesidade Grau II (severa)");
            }else if(imc>=40){
                System.out.println("Obesidade Grau III (m ́orbida");
            }
        }
        sc.close();
    }
}
