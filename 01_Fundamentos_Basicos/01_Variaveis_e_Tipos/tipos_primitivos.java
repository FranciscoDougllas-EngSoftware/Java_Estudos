public class tipos_primitivos {
    public static void main(String[] args) {
        // Tipos primitivos
        // Tipos primitivos sao os tipos de dados que nao podem ser modificados, eles sao: 
        // booleano, byte, short, int, long, float, double, char e string
        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println("Booleano verdadeiro: " + verdadeiro);
        System.out.println("Booleano falso: " + falso);

        // byte
        byte menor = -128;
        byte maior = 127;
        System.out.println("Byte menor: " + menor);
        System.out.println("Byte maior: " + maior);

        // short
        short menor2 = -32768;
        short maior2 = 32767;
        System.out.println("Short menor: " + menor2);
        System.out.println("Short maior: " + maior2);

        // int
        int menor3 = -2147483648;
        int maior3 = 2147483647;
        System.out.println("Int menor: " + menor3);
        System.out.println("Int maior: " + maior3);

        // long
        long menor4 = -9223372036854775808L;
        long maior4 = 9223372036854775807L;
        System.out.println("Long menor: " + menor4);
        System.out.println("Long maior: " + maior4);

        // float
        float menor5 = -3.4028235E38f;
        float maior5 = 3.4028235E38f;
        System.out.println("Float menor: " + menor5);
        System.out.println("Float maior: " + maior5);

        // double
        double menor6 = -1.7976931348623157E308;
        double maior6 = 1.7976931348623157E308;
        System.out.println("Double menor: " + menor6);
        System.out.println("Double maior: " + maior6);

        // char
        char letra = 'a';
        System.out.println("Char: " + letra);

        // string
        String palavra = "palavra";
        System.out.println("String: " + palavra);
    }
}
