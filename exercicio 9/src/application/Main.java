package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2024-04-03");
        LocalDateTime d05 = LocalDateTime.parse("2024-04-03T01:30:26");
        Instant d06 = Instant.parse("2024-04-03T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());  // Convertendo data-hora local considerando o fuso horário da máquina atual

        System.out.println("r1 = " + r1);



    }
}