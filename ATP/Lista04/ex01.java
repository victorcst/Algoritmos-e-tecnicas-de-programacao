public class ex01{
    public static void main(String[] args) {
        int num=0, num2=0;

        while(num<=500){
            if((num%2)!=0){
                if(num%3==0){
                    System.out.println(" "+num);
                    num2 = num2+num;
                }
            }
            num++;
        }
        System.out.println("Resultado final: "+num2);
    }
}