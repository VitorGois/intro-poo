package aula04;

public class principal {
    
    public static void main(String[] args) {
        caneta c1 = new caneta("NIC", "Amarelo", 0.4f);
        c1.status();
        caneta c2 = new caneta("KKK", "Laranja", 1.5f);
        c2.status();
    }
}