package Filmes;

public class Exercicio4 {
    public static void main(String[] args){
        Filme testefilmes = new Filme();
        TestarFilme filme1 = new TestarFilme();
        TestarFilme filme2= new TestarFilme();
        testefilmes.setTitulo("Titanic");
        testefilmes.setDuracaoEmMinutos(194.0);
        testefilmes.setDuracaoEmHoras(194.0);
        testefilmes.teste();

        filme1.setFilme1("Os vingadores 3");
        filme1.setDuracaoEmMinutos(142);
        filme1.setDuracaoEmHoras(142);
        filme1.exibirDuracaoEmHoras();

        filme2.setFilme2("Hotel Transilvânia");
        filme2.setDuracaoEmMinutos2(93.0);
        filme2.setDuracaoEmHoras2(93.0);
        filme2.exibirDuracaoEmHoras2();
   
}
}

