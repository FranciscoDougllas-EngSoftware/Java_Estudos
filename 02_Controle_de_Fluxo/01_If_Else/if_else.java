//Condicionais If else
public class if_else {
    public static void main(String[] args){
        int idade = 18;
        if(idade >= 18 && idade <= 30){
            System.out.println("Voce ja e um Jovem Adulto");
        }else if(idade > 30 && idade <= 60){
            System.out.println("Voce ja e um Adulto");
        }else if(idade > 60){
            System.out.println("Voce ja e um Idoso");
        }else if(idade < 18 && idade > 16){
            System.out.println("Voce ja e um Adolescente");
        }else{
            System.out.println("Voce ainda e uma Crianca");
        }
    }
}
