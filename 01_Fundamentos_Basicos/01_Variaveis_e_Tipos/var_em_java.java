//O Uso do Var em Java
//O var é uma palavra reservada que foi introduzida no Java 10 e 
//é usada para declarar variáveis locais.
public class var_em_java {
    public static void main(String[]args){
        var x = 10;
        var y = 20;
        var z = x + y;
        System.out.println(z);

        //Outro exemplo de utilizacao
        var numero = 10; //declara uma variavel com o valor 10
        var nome = "Maria"; //declara uma variavel do tipo String
        System.out.println(numero);
        System.out.println(nome);
    }
}


//O Var somente pode ser usado em variáveis locais, não pode ser usado em variáveis de instância,
//variáveis de classe, parâmetros de métodos e variáveis de inicialização de arrays.