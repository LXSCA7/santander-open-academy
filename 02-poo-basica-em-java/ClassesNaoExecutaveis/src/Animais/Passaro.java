package Animais;

public class Passaro extends Animal {

    static int numeroDePassaros;

    public Passaro(String nome, int idade, String cor, double altura, double peso, String estadoDeEspirito) {
        super(nome, idade, cor,altura, peso, estadoDeEspirito);
    }
    @Override
    public void soar() {
        System.out.println("Piu!");
    }
}
