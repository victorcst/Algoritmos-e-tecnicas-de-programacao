import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0, contPar=0, cont=0, numGeral=0, numPar=0;

        do{
            System.out.println("Insira um número: ");
            num = sc.nextInt();
            if(num%2==0){
                contPar++;
                numPar = numPar+num;
            }
            numGeral = numGeral+num;
            cont++;
        }while(num>0);

        System.out.println("Média par: "+(numPar/contPar));
        System.out.println("Média geral: "+(numGeral/cont));
        sc.close();
    }
    
}
