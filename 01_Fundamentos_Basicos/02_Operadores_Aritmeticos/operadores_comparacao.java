//Operadores de Comparacao em Java
import java.util.Scanner;
public class operadores_comparacao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.printf("Digite o primeiro numero: ");
        a = sc.nextInt();
        System.out.printf("Digite o segundo numero: ");
        b = sc.nextInt();
        System.out.println(a + " " + b);

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        sc.close();
    }
}
