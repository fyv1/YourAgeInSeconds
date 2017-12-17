package pl.fyv;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Engine {
    public static long getDifferenceDays(Date d1, Date d2) {
        long diff = d2.getTime() - d1.getTime();
        return diff;//TimeUnit.SECONDS.convert(diff, TimeUnit.SECONDS);
    }
}
