//Laco do While em Java
public class break_doWhile {
    public static void main(String[] args){
        int i = 0;
        do{
            i++;
            if (i == 5){
                break;
            }
            System.out.println("i = " + i);
        }while(i < 10);
    }
}
