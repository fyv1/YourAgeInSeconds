package pl.fyv;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner buffer = new Scanner(System.in);
        Engine e = new Engine();

        e.getData(buffer);

        Calendar today = Calendar.getInstance();
        Date todayD = today.getTime();
        Calendar bday = Calendar.getInstance();
        bday.set(u.getYear(), u.getMonth()-1, u.getDay());
        Date bdayD = bday.getTime();


        System.out.println("Twoj wiek w sekundach: "+ e.getDifferenceDays(bdayD, todayD));
    }
}
