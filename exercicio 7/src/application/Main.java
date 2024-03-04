package application;

import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

        /*
        intanciando localdate a partir do horario atual
        LocalDate d01 = LocalDate.now();
        System.out.println(d01); */

        /*
        intanciando LocalDateTime a partir do horario atual
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02); */

        /*
        intanciando o Instant.now com o horário GMT
        Instant d03 = Instant.now();
        System.out.println(d03); */

        /*
        intanciando um texto ISO 8601 e gerando Data-Hora apartir dele"
        LocalDate d04 = LocalDate.parse("2024-03-04");
        System.out.println(d04); */

        /* intanciando um texto ISO 8601 e gerando Data-Hora-Time apartir dele"
        LocalDateTime d05 = LocalDateTime.parse("2024-03-04T15:20:26");
        System.out.println(d05); */

        /* intanciando o Instant.parse com o padrão UTC
        Instant d06 = Instant.parse("2024-03-04T15:20:26Z");
        System.out.println(d06);

        Instant d07 = Instant.parse("2024-03-04T15:20:26-03:00");
        System.out.println(d07); */

        /*
        instanciando o LocalDate usando o DateTimeFormatter
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("04/03/2024", fmt1);
        System.out.println(d08); */

        /*
        instanciando o LocalDateTime usando o DateTimeFormatter
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("04/03/2024 01:30", fmt2);
        System.out.println(d09); */

        // instanciando o LocalDateTime passando dia, mês e ano isoladamente
        LocalDate d10 = LocalDate.of(2024, 03,04);
        System.out.println(d10);

    }
}