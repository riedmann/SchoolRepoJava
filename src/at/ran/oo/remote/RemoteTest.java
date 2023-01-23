package at.ran.oo.remote;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.spi.LocaleServiceProvider;

public class RemoteTest {


    public static void main(String[] args) throws InterruptedException {

        LocalDateTime ld = LocalDateTime.now();
        Thread.sleep(2000);
        LocalDateTime ld1 = LocalDateTime.now();

        Duration duration = Duration.between(ld,ld1);
        System.out.println(duration.getSeconds());



    }
}
