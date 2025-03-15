//Operadores Logicos em Java
//Em java temos 3 operadores logicos: && (AND), || (OR) e ! (NOT)
//O operador && (AND) retorna verdadeiro se as duas expressoes forem verdadeiras
//O operador || (OR) retorna verdadeiro se pelo menos uma das expressoes for verdadeira
//O operador ! (NOT) inverte o valor da expressao

import java.util.Scanner;
public class logicos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        boolean c, d;
        a = 10;
        b = 4;
        c = true;
        d = false;
        System.out.println(a + " " + b + " " + c + " " + d);

        System.out.println(a == b && c == d);
        System.out.println(a == b || c == d);
        System.out.println(!(a == b && c == d));

        sc.close();
    }
}
