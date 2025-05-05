package streams;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class DateAndTimeApi {
    public static void main(String[] args) {

        // Local Date
        /*
         * LocalDate nowDate = LocalDate.now();
         * System.out.println(nowDate);
         * LocalDate customDate = LocalDate.of(2024, 8, 7);
         * System.out.println(nowDate.getDayOfMonth());
         * System.out.println(customDate.getYear());
         * System.out.println(nowDate.getMonth());
         * System.out.println(nowDate.getMonthValue());
         * 
         * LocalDate yesterday = nowDate.minusDays(1);
         * LocalDate pastMonth = nowDate.minusMonths(1);
         * LocalDate pastYear = nowDate.minusYears(20);
         * 
         * System.out.println("past years:- " + pastYear);
         * System.out.println(yesterday);
         * System.out.println(pastMonth);
         * 
         * if (nowDate.isAfter(yesterday)) {
         * System.out.println("yes ");
         * }
         */

        // Local Time
        /*
         * LocalTime nowTime = LocalTime.now();
         * System.out.println(nowTime);
         * 
         * System.out.println(nowTime.getHour());
         * System.out.println(LocalTime.of(nowTime.getHour(), nowTime.getMinute()));
         * LocalTime Stringparse = LocalTime.parse("02:30:20");
         * System.out.println(nowTime.minusHours(2));
         * System.out.println(nowTime.plusHours(2));
         * if (nowTime.isAfter(nowTime.minusHours(2))) {
         * System.out.println("yeah");
         * }
         */

        // LocalDateTime
        /*
         * LocalDateTime now = LocalDateTime.now();
         * System.out.println(now);
         * LocalDateTime parsDateTime = now.parse("2023-11-12T12:34");
         * System.out.println(parsDateTime);
         */

        // ZonedDateTime
        /*
         * ZonedDateTime zonedTime = ZonedDateTime.now();
         * // System.out.println(zonedTime);
         * Set<String> zonesName = ZoneId.getAvailableZoneIds();
         * 
         * // zonesName.forEach(System.out::println);
         * // ZonedDateTime customDateTime = ZonedDateTime.of(2023, 4, 3, 12, 30, 20,
         * 21,
         * // ZoneId.of("NZ"));
         * // System.out.println(customDateTime);
         * 
         * ZonedDateTime indiaTime = ZonedDateTime.now();
         * ZonedDateTime otherTimeOther =
         * ZonedDateTime.now(ZoneId.of("America/New_York"));
         * System.out.println(indiaTime);
         * System.out.println(otherTimeOther);
         * ZoneId zone = indiaTime.getZone();
         * System.out.println(zone);
         */

        // instant
        /*
         * long currentMilliSeconds = System.currentTimeMillis();
         * System.out.println(currentMilliSeconds);
         * Instant now = Instant.now();
         * System.out.println(now); // nano seconds
         * System.out.println(now.getEpochSecond());
         */

        //  Duration
        

    }
}
