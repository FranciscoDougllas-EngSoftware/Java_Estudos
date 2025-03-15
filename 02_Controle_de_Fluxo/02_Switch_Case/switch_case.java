//Switch Case
//O switch case é uma estrutura de controle de fluxo que permite a execução de diferentes blocos de código dependendo do valor de uma variável.
public class switch_case {
    public static void main(String[] args){
        //Nova forma de utiliza o switch case
        int num1 = 5;
        
        switch (num1){
            case 1 -> System.out.println("O número é 1");
            case 2 -> System.out.println("O número é 2");
            case 3 -> System.out.println("O número é 3");
            case 4 -> System.out.println("O número é 4");
            case 5 -> System.out.println("O número é 5");
            default -> System.out.println("O número é diferente de 1 a 5");
        }
    }
}
