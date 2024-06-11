package Animais;

public class Cachorro {
    static int numeroDeCachorros;
    private String nome;
    private int idade;
    private String cor;
    private double altura;
    private double peso;
    private String raca;
    private String estadoDeEspirito;

    public Cachorro() {}
    public Cachorro(String nome, int idade ,String cor, double altura, double peso, String raca, String estadoDeEspirito) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.raca = raca;
        this.estadoDeEspirito = estadoDeEspirito;
        numeroDeCachorros++;
    }

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    private void comer() {}
    public void latir() {
        System.out.println("Au!");
    }

    public String pegar() {
        return "bolinha";
    }

    public String interagir(String acao) {
        switch (acao) {
            case "carinho":
                this.estadoDeEspirito = "feliz";
                break;
            case "vai dormir":
                this.estadoDeEspirito = "dormindo";
                break;
            case "pisar na patinha":
                this.estadoDeEspirito = "triste";
                break;
            default:
                this.estadoDeEspirito = "neutro";
                break;
        }
        return estadoDeEspirito;
    }
}
