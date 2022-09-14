import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float km, litros, consumo;

        System.out.println("Distancia percorrida:");
        km = sc.nextFloat();
        System.out.println("Litros consumidos:");
        litros = sc.nextFloat();
        consumo = km/litros;

        if(consumo<8){
            System.out.println("Venda o carro!");
        }else if(consumo>8 && consumo<=14){
            System.out.println("Economico");
        }else if(consumo>12){
            System.out.println("Super economico");
        }
        sc.close();
    }
}
