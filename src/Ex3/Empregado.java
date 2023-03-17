package Ex3;

public class Empregado {

    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        //O exercício pede que, caso o salário passado seja menor que 0, que setemos o valor em 0.0
        if (salarioMensal < 0)
            salarioMensal = 0.0;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    //Aqui estou calculando o valor anual do salário
    public double getSalarioAnual(){
        return getSalarioMensal() * 12;
    }

    //Aqui estou apenas setando o novo salário com aumento. Esse método só altera o valor se, de fato
    //for chamado na classe teste. Caso não seja chamado o valor mensal do salário segue sendo o que foi passado no construtor.
    public void setAumento() {
        double novoSalario = getSalarioMensal() + getSalarioMensal() * 0.10;
        this.setSalarioMensal(novoSalario);
    }
}