//Continue
public class while_continue {
    public static void main(String[] args){
        int i = 0;
        while(i < 10){
            i++;
            if (i >= 3 && i <= 6){
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
