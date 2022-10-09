import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saqueTotal = 0;
        int saque100 = 0, saque50 = 0, saque20 = 0, saque10 = 0, saque5 = 0, saque2 = 0, saque1 = 0;
        System.out.println("Insira valor do saque: ");
        saqueTotal = sc.nextInt();
        if (saqueTotal >= 100) {
            while (saqueTotal / 100 >= 1) {
                saque100 = (saqueTotal / 100);
                saqueTotal = saqueTotal-(saqueTotal%100);
            }
        } else if(saqueTotal <= 99) {
            while (saqueTotal / 50 >= 1) {
                saque50 = (saqueTotal / 50);
                saqueTotal = saqueTotal-(saqueTotal%50);
            }
        } else if(saqueTotal <= 49) {
            while (saqueTotal / 20 >= 1) {
                saque50 = (saqueTotal / 20);
                saqueTotal = saqueTotal-(saqueTotal%20);
            }
        } else if(saqueTotal == 10) {
            while (saqueTotal / 10 >= 1) {
                saque50 = (saqueTotal / 10);
                saqueTotal = saqueTotal-(saqueTotal%10);
            }
        } else if(saqueTotal <= 9) {
            while (saqueTotal / 5 >= 1) {
                saque50 = (saqueTotal / 5);
                saqueTotal = saqueTotal-(saqueTotal%5);
            }
        } else if(saqueTotal <= 4) {
            while (saqueTotal / 2 >= 1) {
                saque50 = (saqueTotal / 2);
                saqueTotal = saqueTotal-(saqueTotal%2);
            }
        } else if(saqueTotal <= 1) {
            while (saqueTotal / 1 >= 1) {
                saque50 = (saqueTotal / 1);
                saqueTotal = saqueTotal-(saqueTotal%1);
            }
        }

        System.out.println(saque100 + " Notas de 100");
        System.out.println(saque50 + " Notas de 50");
        System.out.println(saque20 + " Notas de 20");
        System.out.println(saque10 + " Notas de 10");
        System.out.println(saque5 + " Notas de 5");
        System.out.println(saque2 + " Notas de 2");
        System.out.println(saque1 + " Notas de 1");
        
        sc.close();
    }
}
