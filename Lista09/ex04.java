import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, cont, somaN = 0;
        int aux, resDiv=0;
        a = sc.nextInt();

        for(cont=2; cont<=a; cont++){
            for(aux = 1; aux<=cont; aux++){
                if(cont%aux==0){
                    resDiv += 1;
                }
                if(aux==cont){
                    if(resDiv==2){
                        somaN += cont;
                    } else {
                        resDiv = 0;
                    }
                }
            }
        }
        System.out.println(somaN);
    }
}
