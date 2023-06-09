package day5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class datetime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter myDateTime = DateTimeFormatter.ofPattern("E, mm dd yyyy");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        String date1 = "22/06/2023";
        String var = dateTime.format(myDateTime);
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(var);

    }
}
