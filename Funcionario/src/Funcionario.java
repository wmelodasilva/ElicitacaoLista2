public class Funcionario {
    private String nome;
    private String sobrenome;
    private double valorPorHora;
    private float horasTrabalhadas;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    
    public double getValorPorHora() {
        return this.valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public float getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void nomeCompleto(){
        System.out.println("Nome completo: "+getNome()+" "+getSobrenome());
    }

    public void calcularSalario(){
        double salario = this.horasTrabalhadas * valorPorHora;
        System.out.println("O salario do funcionário "+getNome()+" é de: R$ "+salario+" reais");
    }

    public void incrementarHoras(int incremento){
        this.horasTrabalhadas += incremento;
    }
}
