package aula07;

public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    // Métodos Públicos
    public void apresentar() {
        System.out.println("-----------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura());
        System.out.println("pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + ((this.getVitorias()==1)?" vitória":" vitórias"));
        System.out.println(this.getDerrotas() + ((this.getDerrotas()==1)?" derrota":" derrotas"));
        System.out.println(this.getEmpates() + ((this.getEmpates()==1)?" empate!":" empates!"));
    }
    public void status() {
        System.out.println("------------------------------------");
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    // Métodos Especiais
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String no) {
        this.nome = no;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int id) {
        this.idade = id;
    }
    public float getAltura() {
        return this.altura;
    }
    public void setAltura(float al) {
        this.altura = al;
    }
    public float getPeso() {
        return this.peso;
    }
    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }
    public String getCategoria() {
        return this.categoria;
    }
    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if(this.peso <= 70.3){
            this.categoria = "Leve";
        } else if(this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if(this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }
    public String getNacionalidade() {
        return this.nacionalidade;
    }
    public int getVitorias() {
        return this.vitorias;
    }
    public void setVitorias(int vi) {
        this.vitorias = vi;
    }
    public int getDerrotas() {
        return this.derrotas;
    }
    public void setDerrotas(int de) {
        this.vitorias = de;
    }
    public int getEmpates() {
        return this.empates;
    }
    public void setEmpates(int em) {
        this.empates = em;
    } 
}