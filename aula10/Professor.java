package aula10;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void receberAumento(float aumento) {
        setSalario(getSalario() + aumento);
    }
    public String getEspecialidade() {
        return this.especialidade;
    }
    public void setEspecialidade(String esp) {
        this.especialidade = esp;
    }
    public float getSalario() {
        return this.salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
}