//Break no while
public class while_break {
    public static void main(String[] args){
        int i = 0;
        while(i < 10){
            i++;
            if (i == 5){
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
