package Filmes;

public class TestarFilme {
    private String filme1;
    private String filme2;
    private double DuracaoEmMinutos;
    private double DuracaoEmHoras;
    private double DuracaoEmMinutos2;
    private double DuracaoEmHoras2;

    public double getDuracaoEmMinutos2() {
        return this.DuracaoEmMinutos2;
    }

    public void setDuracaoEmMinutos2(double DuracaoEmMinutos2) {
        double tminutes2;
        tminutes2 = DuracaoEmMinutos2;
        this.DuracaoEmMinutos2= (tminutes2%60); 
    }

    public double getDuracaoEmHoras2() {
        return this.DuracaoEmHoras2;
    }

    public void setDuracaoEmHoras2(double DuracaoEmHoras2) {
        double t2;
        t2 = DuracaoEmHoras2;
        this.DuracaoEmHoras2 = t2 /60;
    }

    public String getFilme1() {
        return this.filme1;
    }

    public void setFilme1(String filme1) {
        this.filme1 = filme1;
    }

    public String getFilme2() {
        return this.filme2;
    }

    public void setFilme2(String filme2) {
        this.filme2 = filme2;
    }

    public double getDuracaoEmMinutos() {
        return this.DuracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(double DuracaoEmMinutos) {
        double tminutes;
        tminutes = DuracaoEmMinutos;
        this.DuracaoEmMinutos= tminutes%60; 
    }

    public double getDuracaoEmHoras() {
        return this.DuracaoEmHoras;
    }

    public void setDuracaoEmHoras(double DuracaoEmHoras) {
        double t=0;
        t = DuracaoEmHoras;
        this.DuracaoEmHoras = t /60;
    }

    void exibirDuracaoEmHoras(){
        System.out.printf("O filme %s possui um total de %.0f  horas e %.0f minutos\n", getFilme1(), getDuracaoEmHoras(), getDuracaoEmMinutos());
    }
    void exibirDuracaoEmHoras2(){
        System.out.printf("O filme %s possui um total de %.0f  horas e %.0f minutos\n", getFilme2(), Math.floor(getDuracaoEmHoras2()), getDuracaoEmMinutos2());
    }



}
