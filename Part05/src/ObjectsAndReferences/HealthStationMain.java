package ObjectsAndReferences;

import java.util.Scanner;

public class HealthStationMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HealthStation childrenHospital = new HealthStation();
        Person ethan = new Person("Ethan", 1, 7, 110);
        Person peter = new Person("Peter", 33, 85, 176);

        System.out.printf("Weighing performed: %2d times\n", childrenHospital.weighMeasuring());

        childrenHospital.weigh(ethan);
        childrenHospital.weigh(peter);
        System.out.printf("Weighing performed: %2d times\n", childrenHospital.weighMeasuring());

        childrenHospital.feed(ethan);
        childrenHospital.feed(ethan);
        childrenHospital.feed(ethan);

        childrenHospital.weigh(ethan);
        childrenHospital.weigh(ethan);
        childrenHospital.weigh(ethan);
        childrenHospital.weigh(ethan);
        System.out.printf("Weighing performed: %2d times\n", childrenHospital.weighMeasuring());

        System.out.printf("%s's weight: %2d kilos.\n", ethan.getName(), childrenHospital.weigh(ethan));
        System.out.printf("%s's weight: %2d kilos.\n", peter.getName(), childrenHospital.weigh(peter));
    }
}
