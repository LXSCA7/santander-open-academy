package Animais;

public class Animal {
    public Animal(String nome, int idade, String cor, double altura, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    protected String nome;
    protected int idade;
    protected String cor;
    protected double altura;
    protected double peso;
    protected String estadoDeEspirito;

    public void comer() {}
    public void dormir() {}
    public void soar() {
        System.out.println("soou");
    }
}
