import java.util.Scanner;
import java.lang.Math;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;
        double x=0,y=0,z=0, res=0;

        do{
            System.out.println("Digite 3 numeros:");
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            System.out.println("Escolha uma opcao: (geometrica, ponderada, harmonica ou aritmetica)");
            opcao = sc.next();

            if(opcao.equals("geometrica")){
                res = Math.cbrt(x*y*z);
                System.out.println(res);
            }
            else if(opcao.equals("ponderada")){
                res = (x+(2*y)+(3*z)/6);
                System.out.println(res);
            }
            else if(opcao.equals("harmonica")){
                res = (1/((1/x)+(1/y)+(1/z)));
                System.out.println(res);
            }
            else if(opcao.equals("aritmetica")){
                res = ((x+y+z)/3);
                System.out.println(res);
            }
        }while(x>0 && y>0 && z>0);
        sc.close();
    }
}
