public class Main {
    public static void main(String[] args) {

        int nota = 100;
        String graduacao;

        if (nota > 100) {
            graduacao = "";
        } else if (nota >= 80) {
            graduacao = "A";
        } else if (nota >= 70) {
            graduacao = "B";
        } else if (nota >= 60) {
            graduacao = "C";
        } else if (nota >= 50) {
            graduacao = "D";
        } else if (nota < 50 && nota >= 0) {
            graduacao = "E";
        } else {
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aprovado.");
                break;
            case "C":
                System.out.println("Recuperação.");
                break;
            case "D":
            case "E":
                System.out.println("Reprovado.");
                break;
            default:
                System.out.println("Nota inválida.");
        }
    }
}