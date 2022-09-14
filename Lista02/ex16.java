import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, res=0.1;

        while(res>0){
            System.out.println("Insira as notas do aluno:");
            nota1 = sc.nextDouble();
            nota2 = sc.nextDouble();
            res = nota1+nota2;
            if(res<=0){
                System.out.println("Nota invalida");
            }else if(res>=0.1 && res<=10){
                System.out.println("Nota valida");
            }
        }
        sc.close();
    }
}
