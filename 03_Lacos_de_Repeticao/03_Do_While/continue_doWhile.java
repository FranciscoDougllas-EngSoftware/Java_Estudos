//Continue no Do While
public class continue_doWhile {
    public static void main(String[] args){
        int i = 0;
        do{
            i++;
            if (i >= 3 && i <= 6){
                continue;
            }
            System.out.println("i = " + i);
        }while(i < 10);
    }
}
