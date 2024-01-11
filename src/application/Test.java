package application;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDateTime leagueReleaseTime = LocalDateTime.parse("10/01/2024 05:00:00", dtf);

        while (true) {
            Duration duration = Duration.between(currentTime, leagueReleaseTime);

            long hours = duration.toHoursPart();
            long minutes = duration.toMinutesPart();
            long seconds = duration.toSecondsPart();

            System.out.println("Time difference: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
            currentTime = LocalDateTime.now();
            TimeUnit.SECONDS.sleep(1);

        }
    }
}
