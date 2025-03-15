//While true
//O while true e um laco de repeticao que executa um bloco de c
//odigo enquanto a condicao for verdadeira
public class while_true {
    public static void main(String[] args){
        int i = 1;
        while(true){
            System.out.println("i = " + i);
            i++;
            if (i == 11){
                break;
            }
        }
    }
}
