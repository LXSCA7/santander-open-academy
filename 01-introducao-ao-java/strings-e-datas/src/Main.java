import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // manipulações de string:
        String nome = "Lucas";
        String nome2 = "lUcAS";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());
        System.out.println(nome.equalsIgnoreCase(nome2));

        // pegando data atual
        LocalDateTime data = LocalDateTime.now();
        Locale brasil = new Locale("pt", "br");
        int hora = data.getHour();
        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatarHora = DateTimeFormatter.ofPattern("HH:mm");
        String dataFormatada = data.format(formatarData);
        String horaFormatada = data.format(formatarHora);
        String diaDaSemana = data.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        if (hora >= 0 && hora < 12) {
            System.out.printf("Bom dia, %s, hoje é %s. Agora são %s do dia %s ", nome, diaDaSemana, horaFormatada, dataFormatada);
        } else if (hora>= 12 && hora < 18) {
            System.out.printf("Boa tarde, %s, hoje é %s. Agora são %s do dia %s\n", nome, diaDaSemana, horaFormatada, dataFormatada);
        } else {
            System.out.printf("Boa noite, %s, hoje é %s. Agora são %s do dia %s\n", nome, diaDaSemana, horaFormatada, dataFormatada);
        }

    }
}