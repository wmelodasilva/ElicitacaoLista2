package aulasAndre;
public class ExercicioDEUX {
	
	private int PaginasLidas;
	private int Qntpagina;   
	private String Titulo;


	public int getQntpagina() {
		return Qntpagina;
	}
	public void setQntpagina(int qntpagina) {
		Qntpagina = qntpagina;
	}
	public int getPaginasLidas() {
		return PaginasLidas;
	}
	public int setPaginasLidas(int paginasLidas) {
		return PaginasLidas = paginasLidas;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	void progresso() {
		System.out.print("O progresso do livro:"+this.Titulo +"  " + this.PaginasLidas * 100 / this.Qntpagina+ "%");
	}

	void msm(){
		System.out.println("O livro "+ getTitulo() +" possui " +getQntpagina() + " páginas" );
	}

	public void getVerificação(){

        if(this.getPaginasLidas() <= 20 ) {
			System.out.println("O numero de páginas lidas foram : 20 ");
	   }
	   
		else if(this.getPaginasLidas() < 60) {
			System.out.println("O numero de páginas lidas foram: 50");
	   }
    }
	}
	
	

