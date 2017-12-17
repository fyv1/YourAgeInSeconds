package pl.fyv;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner buffer = new Scanner(System.in);
        Engine e = new Engine();

        System.out.println("Twoj wiek w sekundach");
        System.out.println("Podaj dzien urodzenia: "); int d = buffer.nextInt();
        System.out.println("Podaj miesiac: "); int m = buffer.nextInt();
        System.out.println("Podaj rok: "); int y = buffer.nextInt();

        User u = new User(d,m,y);

        Calendar today = Calendar.getInstance();
        Date todayD = today.getTime();
        Calendar bday = Calendar.getInstance();
        bday.set(u.getYear(), u.getMonth()-1, u.getDay());
        Date bdayD = bday.getTime();


        System.out.println("Twoj wiek w sekundach: "+ e.getDifferenceDays(bdayD, todayD));
        
        //todo wrzucic wszystkie te smieci do poszczegolnych klas :V
    }
}
