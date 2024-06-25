package enumertaion.time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek firstDatOfWeek = date.getDayOfWeek();
        DayOfWeek lastDatOfWeek = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

        System.out.println("firstDatOfWeek = " + firstDatOfWeek);
        System.out.println("lastDatOfWeek = " + lastDatOfWeek);
    }
}
