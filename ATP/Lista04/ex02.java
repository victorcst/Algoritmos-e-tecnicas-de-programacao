import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float menorAltura=100, maiorAltura=0;
        float altura=0;
        int cont=0;

        while(cont<15){
            System.out.println("Digite uma altura: ");
            altura = sc.nextFloat();
            if(altura>maiorAltura){
                maiorAltura = altura;
                if(altura<menorAltura){
                    menorAltura = altura;
                }
            }
            cont++;
        }
        System.out.println("Maior altura: "+maiorAltura);
        System.out.println("Menor altura: "+menorAltura);
        sc.close();
    }
    
}
