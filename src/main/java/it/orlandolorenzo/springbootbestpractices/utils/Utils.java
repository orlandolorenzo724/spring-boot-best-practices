package it.orlandolorenzo.springbootbestpractices.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utils {

    private Utils() {
        throw new IllegalStateException("Utility class");
    }

    public static String convertLocalDateToString(LocalDate localDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return localDate.format(formatter);
    }

    public static LocalDate convertStringToLocalDate(String string) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(string, formatter);
    }
}
