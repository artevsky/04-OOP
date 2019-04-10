package timeconstructor;

public class TimeConstructor {
    public static void main(String[] args) {
        TimeDescription time = new TimeDescription(1, 1, 1);
        TimeDescription time1 = new TimeDescription(3661);
        time.printOnlySec();
        time1.printFull();
    }
}
