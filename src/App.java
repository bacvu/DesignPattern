import DayOne.Dayone;
import DayTwo.DayTwo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Dayone dayOne = new Dayone();
        dayOne.executeDayOne();

        DayTwo dayTwo = new DayTwo();
        dayTwo.executeDayTwo();
    }
}
