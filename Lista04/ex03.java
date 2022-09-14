import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num=0,num2=0;
        float cont=0, contNegativos=0, contPositivos=0;

        
        do{
            System.out.println("Insira um número: ");
            num = sc.nextFloat();
            num2 = num2+num;
            if(num>0){
                contPositivos++;
            }
            else if(num<0){
                contNegativos++;
            }
            if(num!=0){
            cont++;
            }
        }while(num!=0);
        System.out.println("Média aritmética dos números digitados: "+(num2/cont));
        System.out.println("Quantidade de positivos digitados: "+contPositivos);
        System.out.println("Quantidade de negativos digitados: "+contNegativos);
        System.out.println("Percentual de números negativos digitados: "+((contNegativos*100)/cont));
        System.out.println("Percentual de números positivos digitados: "+((contPositivos*100)/cont));
        sc.close();
    }
}
