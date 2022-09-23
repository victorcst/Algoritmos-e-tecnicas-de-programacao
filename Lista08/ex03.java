import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numHabitantes;
            float valorKwh;
            int codConsumidor;
            float maiorConsumo=0, menorConsumo=0, consumoMes, consumoMesTotal=0;
            int cont;
            float consumoCod1=0, consumoCod2=0, consumoCod3=0;

            System.out.println("Número de habitantes: ");
            numHabitantes = sc.nextInt();
            System.out.println("Valor Kilowatts Hora: ");
            valorKwh = sc.nextFloat();

            for (cont = 0; cont < numHabitantes; cont++) {
                System.out.println("Consumo do mes: ");
                consumoMes = sc.nextFloat();
                consumoMes = consumoMes*valorKwh;
                consumoMesTotal += consumoMes;
                if(consumoMes>maiorConsumo){
                    maiorConsumo=consumoMes;
                }else if(consumoMes<menorConsumo){
                    menorConsumo = consumoMes;
                }
                if(consumoMes<0 && maiorConsumo==0){
                    maiorConsumo = consumoMes;
                }
                if(consumoMes>0 && menorConsumo==0){
                    menorConsumo = consumoMes;
                }

                System.out.println("Código Consumidor: (1- Residencial, 2-Comercial, 3-Industrial) ");
                codConsumidor = sc.nextInt();
                if(codConsumidor==1){
                    consumoCod1 += consumoMes;
                }else if(codConsumidor==2){
                    consumoCod2 += consumoMes;
                }else if(codConsumidor==3){
                    consumoCod3 += consumoMes;
                }
            }

            System.out.println("Maior consumo: " + maiorConsumo + " " + " Menor consumo: "+ menorConsumo + " " + " Média de consumo: " + (consumoMesTotal/numHabitantes)); 
            System.out.println("Residencial: " + consumoCod1 + " " + " Comercial: " + consumoCod2 + " " + " Industrial: " + consumoCod3);
        }
    }
}
