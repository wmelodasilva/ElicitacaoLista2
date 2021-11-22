package Filmes;

public class Filme {
    private String Titulo;
    private double DuracaoEmMinutos;
    private double DuracaoEmHoras;

    public double getDuracaoEmHoras() {
        return this.DuracaoEmHoras;
    }

    public void setDuracaoEmHoras(Double DuracaoEmMinutos) {
        double t = 0;
        t = DuracaoEmMinutos;
        this.DuracaoEmHoras = t /60;
    }

    public double getDuracaoEmMinutos() {
        return this.DuracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(double DuracaoEmMinutos) {
        this.DuracaoEmMinutos = DuracaoEmMinutos;
    }

	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
    
    void teste(){
        System.out.printf("O filme %s possui um total de %.0f minutos ou aproximadamente %.0f horas\n", getTitulo(), getDuracaoEmMinutos(), getDuracaoEmHoras());
    }
}
