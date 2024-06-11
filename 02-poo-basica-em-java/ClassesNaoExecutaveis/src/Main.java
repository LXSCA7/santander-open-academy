import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Rex", 2, "marrom", 25, 5.5, "vira-lata", "nada");

        Cachorro c2 = new Cachorro("Puppy", 4, "branco", 13, 4.5, "golden", "nada");

        System.out.println(c2.getNumeroDeCachorros());
        System.out.println(c1.getNumeroDeCachorros());

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}