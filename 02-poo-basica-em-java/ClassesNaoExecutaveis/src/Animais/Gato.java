package Animais;

public class Gato extends Animal {

    static int numeroDeGatos;

    public Gato(String nome, int idade, String cor, double altura, double peso, String estadoDeEspirito) {
        super(nome, idade, cor,altura, peso, estadoDeEspirito);
    }

    @Override
    public void soar() {
        System.out.println("Miau!");
    }
}
