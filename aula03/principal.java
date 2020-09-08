package aula03;

public class principal {
    public static void main(final String[] args) {

        caneta c1 = new caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = false;

        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
}