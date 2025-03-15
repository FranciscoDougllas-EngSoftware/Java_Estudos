//Entrada e Saída

import java.util.Scanner;
public class scanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        System.out.println("O número digitado foi: " + num);
        sc.close();
    }
}
