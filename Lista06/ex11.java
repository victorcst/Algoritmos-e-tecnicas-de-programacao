public class ex11 {
    public static void main(String[] args) {
        int num, soma=0;
        for(num=0;num<=100;num++){
            if(num%2==0){
                soma = soma+num;
            }
            if(num==100){
                System.out.println(soma);
            }
        }
    }
}
