//Operadores Aritméticos em Java
public class operadores_aritmeticos {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 5;

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;
        int resto = num1 % num2;
        int potencia = (int)Math.pow(num1, num2);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);
        System.out.println("Potencia: " + potencia);
    }
}
