package aula11;

public class Tecnico extends Aluno {
    private String registroProfissional;

    public void praticar() {
        System.out.println(this.nome + " está praticando!");
    }

    public String getRegistroProfissional() {
        return this.registroProfissional;
    }
    public void setRegistroProfissional(String registro) {
        this.registroProfissional = registro;
    }
}
