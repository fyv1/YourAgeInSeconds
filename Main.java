package pl.fyv;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner buffer = new Scanner(System.in);
        Engine e = new Engine();

        e.getData(buffer);

        System.out.println("Twoj wiek w sekundach: "+ e.getDifferenceDays(e.getBdayD(), e.getTodayD()));
    }
}
