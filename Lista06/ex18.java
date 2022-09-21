import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int quant, num, maior=0, menor=0,cont;
            int contMaior=0, contMenor=0;

            System.out.println("Quantidade de numeros a serem lidos: ");
            quant = sc.nextInt();

            System.out.println("Insira "+quant+" numeros:");
            for(cont=0; cont<=quant; cont++){
                num = sc.nextInt();
                if(num>maior){
                    maior = num;
                    contMaior = 1;
                }else if(num==maior){
                    contMaior++;
                }

                if(num<menor){
                    menor = num;
                    contMaior = 1;
                }else if(num==menor){
                    contMenor++;
                }

                if(num<0 && maior==0){
                    maior = num;
                }
            }

            System.out.println("Maior numero lido: "+maior);
            System.out.println("Foi lido: "+contMaior+" vezes");
            System.out.println("Menor numero lido: "+menor);
            System.out.println("Foi lido: "+contMenor+" vezes");
        }
    }
}
