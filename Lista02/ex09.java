import java.util.Scanner;

public class ex09{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia=0, mes=0, ano=0, anoAtual=2022;

        do{
            System.out.println("Insira a data do seu nascimento");
            System.out.println("Dia: ");
            dia = sc.nextInt();
            System.out.println("Mes: ");
            mes = sc.nextInt();
            System.out.println("Ano: ");
            ano = sc.nextInt();
            if(mes!=2 && mes!=6  && mes!=9 && mes!=11 && mes!=4 && mes<=12 && mes>=1){
                if(dia<=31){
                    if(ano<=anoAtual){
                        System.out.println("Data valida!");
                    }
                }
            }
            if(mes==6  && mes==9 && mes==11 && mes==4){
                if(dia<=30){
                    if(ano<=anoAtual){
                        System.out.println("Data valida!");
                    }
                }
            }
            if(mes==2){
                if(dia<=28){
                    if(ano<=anoAtual){
                        System.out.println("Data valida!");
                    }
                }
            }
            if(mes>12 || dia>31 || ano>anoAtual){
                System.out.println("Data invalida");
            }
        }while(dia > 0 || mes > 0 || ano > 0);
        sc.close();
    }
}