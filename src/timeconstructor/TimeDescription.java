package timeconstructor;

public class TimeDescription {
    int h;
    int m;
    int s;
    int onlySec;


    public TimeDescription(int hour, int min, int sec) {
        this.h = hour;
        this.m = min;
        this.s = sec;
    }

    public void printFull() {

        int sec = (onlySec % 60);
        int m = onlySec / 60;
        int min = (m % 60);
        int hour = m / 60;

        System.out.print(hour + " ч " + min + " мин " + sec + " сек");
    }

    public TimeDescription(int onlySec) {
        this.onlySec = onlySec;
    }

    public void printOnlySec() {
        int result = h * 3600 + m * 60 + s;
        System.out.print("Полное кол-во секунд: " + result + "\n");
    }
}
