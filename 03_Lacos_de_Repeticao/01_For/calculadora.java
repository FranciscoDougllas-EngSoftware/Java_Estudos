//Calculadora em Java
public class calculadora {
    public static void main(String[] args){
        int numero1 = 4;
        String operador = "x";

        for(int i = 1; i <= 10; i ++){
            if (operador.equals("+")){
                System.out.println(numero1 + " + " + i + " = " + (numero1 + i));
            }else if(operador.equals("-")){
                System.out.println(numero1 + " - " + i + " = " + (numero1 - i));
            }else if(operador.equals("x")){
                System.out.println(numero1 + " x " + i + " = " + (numero1 * i));
            }else if(operador.equals("/")){
                System.out.println(numero1 + " / " + i + " = " + (numero1 / i));
            }else{
                System.out.println("Operador inválido");
            }
        }
    }
}
