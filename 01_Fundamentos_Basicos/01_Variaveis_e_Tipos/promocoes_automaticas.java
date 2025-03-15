//Promoções automáticas
//Quando um valor de um tipo menor é atribuído a uma variável de um tipo maior, 
//ocorre a promoção automática.

public class promocoes_automaticas {
    public static void main(String[] args){
        int x = 10;
        long y = x; //promoção automática
        System.out.println(y);

        //byte -> short -> int -> long -> float -> double
        //char -> int -> long -> float -> double
        //Exemplos

        int a = 10;
        long b = a; //promoção automática   
        System.out.println(b);

        char c = 'a';
        int d = c; //promoção automática
        System.out.println(d);
    }
}
