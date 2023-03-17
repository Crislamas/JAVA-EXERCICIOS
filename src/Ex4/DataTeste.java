package Ex4;

public class DataTeste {
    public static void main(String[] args) {
        Data dataAtual = new Data();
        System.out.println("Construtor sem valores pega a data no sistema: " + dataAtual.toString());

        Data data = new Data(2,5,1988);
        System.out.println("Passando uma data: " + data.toString());

        //Adiantando a data em um dia
        data.avancarUmDia();
        System.out.println("Adiantando a data em um dia: " + data.getDia());
    }
}