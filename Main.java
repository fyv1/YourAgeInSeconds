package pl.fyv;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner buffer = new Scanner(System.in);

       /* System.out.println("Twoj wiek w sekundach");
        System.out.println("Podaj dzien urodzenia: "); int d = buffer.nextInt();
        System.out.println("Podaj miesiac: "); int m = buffer.nextInt();
        System.out.println("Podaj rok: "); int y = buffer.nextInt();

        User u = new User(d,m,y);*/


        Calendar today = Calendar.getInstance();
        System.out.println(new SimpleDateFormat("MM-MM-yyyy").format(today.getTime()));

    }
}
