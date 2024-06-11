import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        c1.nome = "Rex";
        c1.cor = "marrom";
        c1.altura = 25;
        c1.peso = 5.5;
        c1.idade = 2;

        c1.latir();
        System.out.println("O cachorro pegou a " + c1.pegar());
        System.out.println("O cachorro está " + c1.interagir("carinho"));
        System.out.println("O cachorro está " + c1.interagir("nada"));
        System.out.println("O cachorro está " + c1.interagir("vai dormir"));
    }
}