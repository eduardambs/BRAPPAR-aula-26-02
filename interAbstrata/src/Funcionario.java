public class Funcionario {
    private String nome;
    private float salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if (salario > 0)
            this.salario = salario;
        else
            this.salario = 0;
    }

}
