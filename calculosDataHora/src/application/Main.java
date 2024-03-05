package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2024-03-05"); // apenas data
        LocalDateTime d05 = LocalDateTime.parse("2024-03-05T01:30:26"); // data local
        Instant d06 = Instant.parse("2024-03-05T01:30:26Z"); // data global

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("d04 = " + d04);
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay()); // LocalDate não suporta segundos. precisa converter para LocalDateTime
        System.out.println("t1 dias = " + t1.toDays());

        System.out.println("--------------------------------------------------------");

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        LocalDateTime nextHourLocalDateTime = d05.minusMinutes(10);

        System.out.println("d05 = " + d05);
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println("nextHourLocalDateTime = " + nextHourLocalDateTime);

        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        System.out.println("t2 horas = " + t2.toHours());

        System.out.println("--------------------------------------------------------");

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t3 = Duration.between(pastWeekInstant, d06);
        System.out.println("t3 segundos = " + t3.toSeconds());

        Duration t4 = Duration.between(d06,pastWeekInstant);
        System.out.println("t4 segundos = " + t4.toSeconds());

    }
}