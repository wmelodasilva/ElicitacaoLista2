package aulasAndre;
// Exercicio 3 que está utilizando o arquivo do Exercicio 2 como base utilizando conceito de polimorfismo
public class TestarLivro{
	public static void main(String[] args) {
		
		ExercicioDEUX livrofv = new ExercicioDEUX();
		
		livrofv.setTitulo("Pequeno principe");
		
		livrofv.setQntpagina(98);
		
		livrofv.msm();
		
		livrofv.getVerificação();
		
		
	}
	
}
