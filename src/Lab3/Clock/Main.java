package Lab3.Clock;

public class Main {
    public static void main(String[] args) {
        ClockDisplay clockDisplay = new ClockDisplay(10,10);
        System.out.println(clockDisplay.getTime());
        clockDisplay.timeTick();
        System.out.println(clockDisplay.getTime());
        for(int i = 0;i < 59;i++)
        {
            clockDisplay.timeTick();
        }
        System.out.println(clockDisplay.getTime());

    }
}
