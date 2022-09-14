import java.util.Scanner;

public class ex15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario=0, validaEmprestimo=0, emprestimoDesejado;

        do{
            System.out.println("Salario recebido:");
            salario = sc.nextFloat();
            System.out.println("Emprestimo desejado:");
            emprestimoDesejado = sc.nextFloat();
            validaEmprestimo = salario-(0.8*salario);
            if(emprestimoDesejado<=validaEmprestimo){
                System.out.println("Emprestimo concedido");
            }else if(emprestimoDesejado>validaEmprestimo){
                System.out.println("Emprestimo negado");
            }
        }while(salario>0);
        sc.close();
    }
}