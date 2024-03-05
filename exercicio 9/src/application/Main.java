package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2024-05-03");
        LocalDateTime d05 = LocalDateTime.parse("2024-04-03T01:30:26");
        Instant d06 = Instant.parse("2024-04-03T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());  //convertendo data-hora local considerando o fuso horário da máquina atual baseado no Instant
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); //convertendo data-hora local considerando o fuso horário de Portugal baseado no Instant

        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault()); //convertendo data-hora-time local considerando o fuso horário de Portugal baseado no Instant
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal")); //convertendo data-hora-time local considerando o fuso horário de Portugal baseado no Instant

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 dia = " + d04.getMonthValue());

    }
}