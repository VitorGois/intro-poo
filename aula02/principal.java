package aula02;

public class principal {
    public static void main(final String[] args) {

        caneta c1 = new caneta();   //instanciando um objeto, ou seja, criando um objeto a partir da classe(molde)
        
        c1.cor = "Azul";    //atribuindo valores aos atributos da classe do objeto
        c1.ponta = 0.5f;
        c1.tampada = false;
        
        c1.tampar();
        c1.status();    //referencia a metodo
        c1.rabiscar();
        
        caneta c2 = new caneta();
        c2.modelo = "BIC Cristal";
        c2.cor = "Azul";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}