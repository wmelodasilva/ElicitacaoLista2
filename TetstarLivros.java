package aluasAndre;
public class TetstarLivros {
	
	public static void main(String[] args) {
		
		ExercicioDEUX livrofv = new ExercicioDEUX();
		
		livrofv.setTitulo("Pequeno principe");
		
		livrofv.setQntpagina(98);
		
		livrofv.msm();
		
		if(livrofv.getPaginasLidas() <= 20 ) {
			System.out.println("O numero de paginas lidas foram : 20 ");
		}
		
		if(livrofv.getPaginasLidas() < 50) {
			System.out.println("O numero de páginas lidas foram: 50");
		}
		
	}
}
