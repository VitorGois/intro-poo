package aula10;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public void mudaTrabalho() {
        setTrabalhando(! getTrabalhando());
    }
    public String getSetor() {
        return this.setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public boolean getTrabalhando() {
        return this.trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}