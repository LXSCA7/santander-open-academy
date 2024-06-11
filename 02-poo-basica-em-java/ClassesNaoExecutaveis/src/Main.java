import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        c1.setNome("Rex");
        c1.setCor("marrom");
        c1.setAltura(25);
        c1.setPeso(5.5);
        c1.setIdade(2);

        Cachorro c2 = new Cachorro("Puppy", "branco", 13, 4.5, "golden", "nada");

        c1.latir();
        System.out.println("O cachorro pegou a " + c1.pegar());
        System.out.println("O cachorro está " + c1.interagir("carinho"));
        System.out.println("O cachorro está " + c1.interagir("nada"));
        System.out.println("O cachorro está " + c1.interagir("vai dormir"));

        System.out.println(c2.getNome());
        System.out.println(c2.getPeso());
    }
}