public class Exercicio{
    public static void main(String[] args) throws Exception {
        Funcionario novoFuncionario = new Funcionario();
        novoFuncionario.setNome("Pedro");
        novoFuncionario.setSobrenome("Antônio");
        novoFuncionario.setHorasTrabalhadas(15);
        novoFuncionario.setValorPorHora(32.50);
        novoFuncionario.nomeCompleto();
        novoFuncionario.incrementarHoras(8);
        novoFuncionario.calcularSalario();
    }
}
