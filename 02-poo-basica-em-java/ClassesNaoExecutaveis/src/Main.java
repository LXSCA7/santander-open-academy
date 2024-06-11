import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Rex", 2, "marrom", 25, 5.5, "nada");

        Cachorro c2 = new Cachorro("Puppy", 4, "branco", 13, 4.5, "nada");

        Gato g1 = new Gato("Garfield", 5, "laranja", 14, 5.1, "nada");
        Gato g2 = new Gato("Bichento", 3, "laranja", 14, 5.1, "nada");

        Passaro p1 = new Passaro("piupiu", 3, "amarelo", 4, 0.4, "nada");

        Petshop petshop = new Petshop();
        petshop.darBanho(g1);
        petshop.tosar(c1);
        petshop.deixarNoHotel(p1);
        System.out.println(c1.getEstadoDeEspirito());
        System.out.println(g1.getEstadoDeEspirito());
        System.out.println(p1.getEstadoDeEspirito());
        p1.soar();
    }
}