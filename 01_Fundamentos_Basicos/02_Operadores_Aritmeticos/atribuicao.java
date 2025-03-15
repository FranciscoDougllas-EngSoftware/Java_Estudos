//OPeradores de Atribuicao em Java
//Em java temos 8 operadores de atribuicao: =, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=
public class atribuicao {
    public static void main(String[] args){
        int a, b;
        a = 10;
        b = 5;
        System.out.println(a + " " + b);
        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a *= b);
        System.out.println(a /= b);
        System.out.println(a %= b);
        System.out.println(a &= b);
        System.out.println(a |= b);
        System.out.println(a ^= b);
        System.out.println(a <<= b);
        System.out.println(a >>= b);
        System.out.println(a >>>= b);
    }
}
