package ProgrammingParadigms;

public class ProceduralProgramming {
    public static void main(String[] args) {
        int hours = 0, minutes = 0, seconds = 0;

        while (true) {
            print(hours, minutes, seconds);
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
    public static void print(int hours, int minutes, int seconds) {
        print(hours);
        print(minutes);
        print(seconds);
    }
    private static void print(int value) {
        if (value < 10) {
            System.out.print("0");
        }
        System.out.print(value);
    }
}
