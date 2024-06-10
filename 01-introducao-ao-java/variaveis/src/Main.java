public class Main {
    public static void main(String[] args) {

        int a = 3;
        int b = 2;

        realizarCalculos(a, b);
    }

    public static void realizarCalculos(int a, int b) {
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        float divisao = (float) a / (float) b;
        System.out.println(a + " + " + b + " = " + soma);
        System.out.println(a + " - " + b + " = " + subtracao);
        System.out.println(a + " * " + b + " = " + multiplicacao);
        System.out.println(a + " / " + b + " = " + divisao);
    }
}