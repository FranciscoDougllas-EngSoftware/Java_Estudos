//Identificadores validos em Java

public class identificadores {
    public static void main(String[] args) {
        int var1 = 10;
        int $var2 = 20;
        int var_3 = 30;
        int var4 = 40;
        int var5$ = 50;

        //Nao posso usar palavras reservadas como identificadores
        //int public = 10;

        //Nao posso usar caracteres especiais como identificadores
        //int @var = 10;

        //Nao posso usar numeros como identificadores
        //int 1var = 10;

        System.out.println(var1);
        System.out.println($var2);
        System.out.println(var_3);
        System.out.println(var4);
        System.out.println(var5$);
    }
}