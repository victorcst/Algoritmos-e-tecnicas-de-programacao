import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int num=1;
            int count, countPar=0, soma=0, somaPar=0, maior=0, menor=0;

            System.out.println("Insira numeros, a repeticao se encerrara ao inserir o numero 0: ");
            for(count=0; num!=0; count++){
                num = sc.nextInt();
                soma += num;

                if(num>maior){
                    maior=num;
                }else if(num<menor){
                    menor = num;
                }
                if(num<0 && maior==0){
                    maior = num;
                }
                if(num>0 && menor==0){
                    menor = num;
                }

                if(num%2==0){
                    countPar++;
                    somaPar += num;
                }

                if(num==0){
                    count--;
                }
            }
            System.out.println("Soma dos numeros: " + soma);
            System.out.println("Quantidade de numeros digitados: "+ count);
            System.out.println("Media dos numeros digitados: " + (soma/count));
            System.out.println("Media dos numeros pares digitados: " + (somaPar/countPar));
            System.out.println("Maior numero digitado: " + maior);
            System.out.println("Menor numero digitado: " + menor);
        }
    }
}
