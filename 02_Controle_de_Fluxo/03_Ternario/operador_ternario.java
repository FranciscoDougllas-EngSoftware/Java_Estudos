//Operadores Ternarios
//Sintaxe: condição ? verdadeiro : falso
//O operador ternário é uma forma concisa de escrever uma instrução if-else

//Se a condição for verdadeira, o operador ternário retorna o valor da expressão verdadeira
//Se a condição for falsa, ele retorna o valor da expressão falsa

//O operador ternário é muito utilizado para atribuir valores a variáveis, evitando a necessidade de escrever instruções if-else
public class operador_ternario {
    public static void main(String[] args){
        int idade = 18;
        String status;
        status = idade >= 18 ? "Maior de Idade" : "Menor de Idade";
        System.out.println(status);

        String sexo = "M";
        String genero = sexo.equals("M") ? "Masculino" : "Feminino";
        System.out.println(genero);
    }
}
