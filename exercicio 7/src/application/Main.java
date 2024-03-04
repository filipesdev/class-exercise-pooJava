package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        /* LocalDate d01 = LocalDate.now();
        System.out.println(d01); */

        /* LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02); */

        /* Instant d03 = Instant.now();
        System.out.println(d03); */

        LocalDate d04 = LocalDate.parse("2024-03-04");
        System.out.println(d04);
    }
}