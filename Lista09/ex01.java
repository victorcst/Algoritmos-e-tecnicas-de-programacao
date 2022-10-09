public class ex01{
    public static void main(String[] args) {
        double salario=2000, aumento=1.5; 
        int ano, cont;
        for(ano=1996; ano<2022; ano++){
            for(cont=1995; cont<ano; cont++){
                aumento += aumento;
            }
            salario += (salario*(aumento/100));
        }
        System.out.println("Salario final: " + salario);
        System.out.println(aumento);
    }
}     