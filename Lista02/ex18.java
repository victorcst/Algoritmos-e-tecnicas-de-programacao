import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entradaHoras=0, entradaMinutos=0;
        int saidaHoras=0, saidaMinutos=0;
        int tempoTotal;
        double valor;

        while(entradaHoras>=0){
            System.out.println("Horario entrada");
            System.out.println("Horas:");
            entradaHoras = sc.nextInt();
            System.out.println("Minutos:");
            entradaMinutos = sc.nextInt();

            if(entradaHoras>0 && entradaMinutos>=0){
            System.out.println("Horario saida");
            System.out.println("Horas:");
            saidaHoras = sc.nextInt();
            System.out.println("Minutos:");
            saidaMinutos = sc.nextInt();
            tempoTotal = (saidaHoras-entradaHoras);
            if(saidaMinutos>1){
                tempoTotal += +1;
                if(tempoTotal>=1 && tempoTotal<=2){
                    valor = 1*tempoTotal;
                    System.out.println("Valor: "+valor);
                }else if(tempoTotal>=3 && tempoTotal<=4){
                    valor = 1.4*tempoTotal;
                    System.out.println("Valor: "+valor);
                }else if(tempoTotal>=5){
                    valor = 2*tempoTotal;
                    System.out.println("Valor: "+valor);
                }
            }
        }
        sc.close();
    }
}
}
