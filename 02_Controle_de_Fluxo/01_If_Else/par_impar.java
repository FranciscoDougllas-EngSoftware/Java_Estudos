public class par_impar {
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 7;
        int result = num1 + num2;
        if(result % 2 == 0){
            System.out.println("O número " + result + " é par");
        } else {
            System.out.println("O número " + result + " é ímpar");
        }
    }
}
