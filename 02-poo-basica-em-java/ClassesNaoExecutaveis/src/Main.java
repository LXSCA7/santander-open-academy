import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Rex", 2, "marrom", 25, 5.5, "nada");

        Cachorro c2 = new Cachorro("Puppy", 4, "branco", 13, 4.5, "nada");

        Gato g1 = new Gato("Garfield", 5, "laranja", 14, 5.1, "nada");
        Gato g2 = new Gato("Bichento", 3, "laranja", 14, 5.1, "nada");

        Passaro p1 = new Passaro("piupiu", 3, "amarelo", 4, 0.4, "nada");

        c1.soar();
        g1.soar();
        p1.soar();
    }
}