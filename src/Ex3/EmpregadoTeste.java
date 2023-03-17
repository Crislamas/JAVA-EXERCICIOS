package Ex3;
import java.text.DecimalFormat;

public class EmpregadoTeste {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("R$ #, ##0.00");
		
		Empregado empregado1 = new Empregado("Antonio", "Souza", 4000.00);
		System.out.println("Empregado: " + empregado1.getNome() + " " + empregado1.getSobrenome() + " Salário mensal: " + df.format(empregado1.getSalarioMensal()) + "Salário anual: " + df.format(empregado1.getSalarioAnual()));
        Empregado empregado2 = new Empregado("José", "Silva", 8000.00);
        System.out.println("Empregado: " + empregado2.getNome() + " " + empregado2.getSobrenome() + " Salário mensal: " + df.format(empregado2.getSalarioMensal())  + "Salário anual: " + df.format(empregado2.getSalarioAnual()));

        empregado1.setAumento();
        System.out.println("Empregado: " + empregado1.getNome());
        System.out.println("Novo Salário Mensal: " + df.format(empregado1.getSalarioMensal()));
        System.out.println("Novo Salário Anual: " + df.format(empregado1.getSalarioAnual()));
        
        System.out.println("Novo Salário Mensal: " + df.format(empregado2.getSalarioMensal()));
        System.out.println("Novo Salário Anual: " + df.format(empregado2.getSalarioAnual()));
        
}
}