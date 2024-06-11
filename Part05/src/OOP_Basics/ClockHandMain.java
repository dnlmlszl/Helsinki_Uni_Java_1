package OOP_Basics;

public class ClockHandMain {
    public static void main(String[] args) {
        // Clock clock = new Clock();
        Timer timer = new Timer();
        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
