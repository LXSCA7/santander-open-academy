public class Main {
    public static void main(String[] args) {

        boolean fimDeSemana = true;
        boolean estaSol = true;
        boolean vamosAPraia = fimDeSemana && estaSol;

        System.out.println(vamosAPraia ? "Vamos à praia!!!!" : "Não vamos :(");
    }
}