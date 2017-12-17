package pl.fyv;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner buffer = new Scanner(System.in);

        System.out.println("Twoj wiek w sekundach");
        System.out.println("Podaj dzien urodzenia: "); int d = buffer.nextInt();
        System.out.println("Podaj miesiac: "); int m = buffer.nextInt();
        System.out.println("Podaj rok: "); int y = buffer.nextInt();

        User u = new User(d,m,y);

        //todo formating data objects

        Calendar today = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
        Date todayD = today.getTime();
        sdf.format(todayD);
        System.out.println(todayD);

        Calendar bday = Calendar.getInstance();
        bday.set(u.getYear(), u.getMonth()-1, u.getDay());
        Date bdayD = bday.getTime();
        sdf.format(bdayD);
        System.out.println(bdayD);
    }
}
