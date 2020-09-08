package aula12;

public class Principal {
    public static void main(String[] args) {
        //Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();

        //sub-classe da super-classae
        m.locomover();
        a.locomover();
        p.locomover();
        r.locomover();

        //sub-classes da sub-classe que é super-classe
        c.locomover();
        k.locomover();
        j.locomover();
        t.locomover();
        g.locomover();
        e.locomover();

        c.emitirSom();
        k.emitirSom();
        j.emitirSom();
        t.emitirSom();
        g.emitirSom();
        e.emitirSom();

        c.usarBolsa();
        k.enterrarOsso();
        k.abanarRabo();
    }
}
