package tasktime;

import java.util.Scanner;

public class Time {
    void printF() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите часы:");
        int hIn = scan.nextInt();
        System.out.println("Введите минуты:");
        int mIn = scan.nextInt();
        System.out.println("Введите секунды:");
        int sIn = scan.nextInt();
        System.out.println("Выберите вариант вывода времени:\n1 - Полный формат\n2 - Общее количество секунд");
        System.out.println("Ведите значение:");
        int var = scan.nextInt();
        scan.close();

        if (var == 1) {
            System.out.println("Полный формат: ");

            int min;
            int hour;
            int sec = sIn % 60;
            int m = sIn / 60;
            if (mIn == 59 && sIn > 59) {
                min = m % 60 - 1;
                hour = m / 60 + hIn + 1;
                System.out.println(hour + " ч " + min + " мин " + sec + " сек");
            } else if (mIn > 59) {
                min = (m + mIn) % 60;
                hour = (m + mIn) / 60 + hIn;
                System.out.println(hour + " ч " + min + " мин " + sec + " сек");
            } else if (mIn < 59 && sIn > 59) {
                min = (m + mIn) % 60;
                hour = (m + mIn) / 60 + hIn;
                System.out.println(hour + " ч " + min + " мин " + sec + " сек");
            } else {
                min = m % 60 + mIn;
                hour = m / 60 + hIn;
                System.out.println(hour + " ч " + min + " мин " + sec + " сек");
            }
        }
        else if (var ==2 ) {
            int result = hIn * 3600 + mIn * 60 + sIn;
            System.out.println("Общее количество секунд: ");
            System.out.println(result + " сек");
        }
    }
}
