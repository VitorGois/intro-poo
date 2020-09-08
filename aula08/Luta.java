package aula08;

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos Públicos
    public void marcarLuta(final Lutador l1, final Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) || l1 == l2) {
            this.setAprovada(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }

    public void lutar() {
        if (this.isAprovada()) {
            // Preencher Atributos dos Lutadores
            // Desafiante
            int pvDesafiante = this.getDesafiante().getIdade() * 5;
            int forcaDesafiante = (int) (this.getDesafiante().getPeso() / 4);
            int defDesafiante = (int) (this.getDesafiante().getAltura() / 0.1);
            // Desafiado
            int pvDesafiado = this.getDesafiado().getIdade() * 5;
            int forcaDesafiado = (int) (this.getDesafiado().getPeso() / 4);
            int defDesafiado = (int) (this.getDesafiado().getAltura() / 0.1);

            // Outras variáveis
            Random turno = new Random(); // Definirá quem dará o próximo golpe
            Random pot = new Random();
            int golpe; // Valor do golpe acertado
            int defesa; // Valor da defesa realizada
            int dano; // Dano final levado
            int vez; // De quem é o turno
            int potencia; // Intensidade do golpe
            System.out.println("=================================================");
            System.out.println(this.getDesafiante().getNome() + " X " + this.getDesafiado().getNome());
            System.out.println("=================================================");
            this.getDesafiante().apresentar();
            System.out.println("Pontos de Vida: " + pvDesafiante);
            this.getDesafiado().apresentar();
            System.out.println("Pontos de Vida: " + pvDesafiado);
            System.out.println("");

            do {
                vez = turno.nextInt(2); // 0 1
                switch (vez) {
                    case 1: // Turno do Desafiante
                        potencia = pot.nextInt(10);
                        switch (potencia) {
                            case 8:
                                golpe = (potencia + forcaDesafiante) * 2;
                                System.out.println("Acerto crítico!");
                                break;
                            default:
                                golpe = potencia + forcaDesafiante;
                                break;
                        }
                        potencia = pot.nextInt(10);
                        switch (potencia) {
                            case 7:
                                defesa = (potencia + defDesafiado) * 2;
                                System.out.println("Defesa crítica!");
                                break;

                            default:
                                defesa = potencia + defDesafiado;
                                break;
                        }
                        dano = golpe - defesa;
                        if (dano > 0) {
                            pvDesafiado -= dano;
                            System.out.println(getDesafiante().getNome() + " acertou um golpe! (" + dano + ")");
                            System.out.println(getDesafiado().getNome() + " esta com " + pvDesafiado + "HP");
                            System.out.println("");
                        } else {
                            System.out.println(getDesafiado().getNome() + " lançou um golpe!");
                            System.out.println(getDesafiante().getNome() + " esquivou!");
                            System.out.println("");
                        }
                        break;

                    default: // Turno do Desafiado
                        potencia = pot.nextInt(10);
                        switch (potencia) {
                            case 8:
                                golpe = (potencia + forcaDesafiado) * 2;
                                System.out.println("Acerto crítico!");
                                break;
                            default:
                                golpe = potencia + forcaDesafiado;
                                break;
                        }
                        potencia = pot.nextInt(10);
                        switch (potencia) {
                            case 7:
                                defesa = (potencia + defDesafiante) * 2;
                                System.out.println("Defesa crítica!");
                                break;

                            default:
                                defesa = potencia + defDesafiante;
                                break;
                        }
                        dano = golpe - defesa;
                        if (dano > 0) {
                            pvDesafiante -= dano;
                            System.out.println(getDesafiante().getNome() + " acertou um golpe! (" + dano + ")");
                            System.out.println(getDesafiado().getNome() + " esta com " + pvDesafiante + "HP");
                            System.out.println("");
                        } else {
                            System.out.println(getDesafiado().getNome() + " lançou um golpe!");
                            System.out.println(getDesafiante().getNome() + " esquivou!");
                            System.out.println("");
                        }
                        break;
                }
            } while (pvDesafiante > 0 && pvDesafiado > 0);

            if (pvDesafiado < 0) {
                System.out.println("Vitória de " + getDesafiante().getNome() + "!");
                this.getDesafiado().perderLuta();
                this.getDesafiante().ganharLuta();
                System.out.println("Status atualizado: ");
                this.getDesafiante().status();
            } else {
                System.out.println("Vitória de " + getDesafiado().getNome() + "!");
                this.getDesafiante().perderLuta();
                this.getDesafiado().ganharLuta();
                System.out.println("Status atualizado: ");
                this.getDesafiado().status();
            }

        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }

    // Métodos Especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(final Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(final Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(final int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(final boolean aprovada) {
        this.aprovada = aprovada;
    }
}