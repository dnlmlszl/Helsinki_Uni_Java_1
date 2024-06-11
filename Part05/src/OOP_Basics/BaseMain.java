package OOP_Basics;

public class BaseMain {
    public static void main(String[] args) {
        int hours = 0, minutes = 0, seconds = 0;
        while (true) {
            if (hours < 10) {
                System.out.println("0");
            }
            System.out.println(hours);
            System.out.println(":");

            if (minutes < 10) {
                System.out.println("0");
            }
            System.out.println(minutes);
            System.out.println(":");

            if (seconds < 10) {
                System.out.print("0");
            }
            System.out.print(seconds);
            System.out.println();

            seconds = seconds + 1;

            if (seconds > 59) {
                minutes = minutes + 1;
                seconds = 0;

                if (minutes > 59) {
                    hours = hours + 1;
                    minutes = 0;

                    if (hours > 23) {
                        hours = 0;
                    }
                }
            }
        }
    }
}
