package Animais;

public class Cachorro {

    public String nome;
    public int idade;
    public String cor;
    public double altura;
    public double peso;
    public String raca;
    public String estadoDeEspirito;

    public void comer() {}
    public void latir() {
        System.out.println("Au!");
    }

    public String pegar() {
        return "bolinha";
    }

    public String interagir(String acao) {
        if (acao.equals("carinho")) {
            this.estadoDeEspirito = "feliz";
        } else if (acao.equals("vai dormir")) {
            this.estadoDeEspirito = "dormindo";
        } else {
            this.estadoDeEspirito = "neutro";
        }

        return estadoDeEspirito;
    }
}
