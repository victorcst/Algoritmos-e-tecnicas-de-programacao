import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double custoFabrica=0, valorVeiculo;

        while(custoFabrica>=0){
            System.out.println("Custo da fabrica:");
            custoFabrica = sc.nextDouble();
            if(custoFabrica<=12000){
                valorVeiculo = custoFabrica+(0.05*custoFabrica);
                System.out.println("Valor: "+valorVeiculo);
            }else if(custoFabrica>12000 && custoFabrica<=25000){
                valorVeiculo = custoFabrica+(0.1*custoFabrica)+(0.15*custoFabrica);
                System.out.println("Valor: "+valorVeiculo);
            }else if(custoFabrica>25000){
                valorVeiculo = custoFabrica+(0.15*custoFabrica)+(0.2*custoFabrica);
                System.out.println("Valor: "+valorVeiculo);
            }
        }
        sc.close();
    }
    
}
