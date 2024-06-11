package ObjectsAndReferences;

public class AmusementParkRideMain {
    public static void main(String[] args) {
        Person matt = new Person("Matt");
        matt.setHeight(160);
        matt.setWeight(86);

        Person jasper = new Person("Jasper");
        jasper.setWeight(34);
        jasper.setHeight(132);

        AmusementParkRide waterTrack = new AmusementParkRide("Water track", 140);

        if (waterTrack.allowedToRide(matt)) {
            System.out.printf("%s may enter the ride\n", matt.getName());
        } else {
            System.out.printf("%s may not enter the ride\n", matt.getName());
        }

        if (waterTrack.allowedToRide(jasper)) {
            System.out.printf("%s may enter the ride\n", jasper.getName());
        } else {
            System.out.printf("%s may not enter the ride\n", jasper.getName());
        }

        System.out.println(waterTrack);
    }
}
