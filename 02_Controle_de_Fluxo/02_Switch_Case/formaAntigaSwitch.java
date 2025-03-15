public class formaAntigaSwitch {
    public static void main(String[] args){
        //Forma antiga de utilizar o switch case
        int num1 = 5;

        switch (num1){
            case 1:
                System.out.println("O número é 1");
                break;
            case 2:
                System.out.println("O número é 2");
                break;
            case 3:
                System.out.println("O número é 3");
                break;
            case 4:
                System.out.println("O número é 4");
                break;
            case 5:
                System.out.println("O número é 5");
                break;
            default:
                System.out.println("O número é diferente de 1 a 5");
                break;
        }
    }
}
