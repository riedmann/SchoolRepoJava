package at.ran.oo.demo.remote;

import java.time.Duration;
import java.time.LocalDateTime;

public class RemoteTest {


    public static void main(String[] args) throws InterruptedException {

        LocalDateTime ld = LocalDateTime.now();
        Thread.sleep(2000);
        LocalDateTime ld1 = LocalDateTime.now();

        Duration duration = Duration.between(ld,ld1);
        System.out.println(duration.getSeconds());



    }
}
