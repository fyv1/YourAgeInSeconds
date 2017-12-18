package pl.fyv;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Engine {

    public static long getDifferenceDays(Date d1, Date d2) {
        return d2.getTime() - d1.getTime();
    }

    public void getData(Scanner buffer) {
        System.out.println("Twoj wiek w sekundach");
        System.out.println("Podaj dzien urodzenia: "); int d = buffer.nextInt();
        System.out.println("Podaj miesiac: "); int m = buffer.nextInt();
        System.out.println("Podaj rok: "); int y = buffer.nextInt();

        User u = new User(d,m,y);

        try {
            checkData(u);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    private void checkData(User u) {
        if(u.getDay() < 1 || u.getDay() > 31) { // TODO rozroznianie ilosci dni ze wzgledu na miesiac
            throw new IllegalArgumentException("Niepoprawny zakres dni");
        }
        if(u.getMonth() < 1 || u.getMonth() > 12) {
            throw new IllegalArgumentException("Niepoprawny zakres miesiecy");
        }
        if(u.getYear() > 2017) { // TODO pobierac obecny rok z obiektu Calendar
            throw new IllegalArgumentException("Niepoprawny rok");
        }
    }


}
