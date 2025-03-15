public class switch_initialization {
    public static void main(String[] args){
        int day = 5;

        switch(day){
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Dia inválido");
        }

        String dia = "Ter";

        String diaSemana = switch(dia){
            case "Seg", "Ter", "Qua", "Qui", "Sex" -> "Dia da semana";
            case "Sab", "Dom" -> "Fim de semana";
            default -> "Dia inválido";
        };

        System.out.println(diaSemana);
    }
}
