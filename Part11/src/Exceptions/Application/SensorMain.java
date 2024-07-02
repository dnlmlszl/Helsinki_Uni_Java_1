package Exceptions.Application;

public class SensorMain {
    public static void main(String[] args) {
        standardSensorTest();

        tempSensorTest();

        avgSensorTest();

        avgSensorWithReadings();
    }

    private static void avgSensorWithReadings() {
        Sensor kumpula = new TemperatureSensor();
        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        helsinkiRegion.setOn();
        System.out.println("Temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("Temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("Temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");

        System.out.println("Readings: " + helsinkiRegion.readings());
    }

    private static void avgSensorTest() {
        Sensor kumpula = new TemperatureSensor();
        kumpula.setOn();
        System.out.println("Temperature in Kumpula " + kumpula.read() + " degrees Celsius.");

        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        helsinkiRegion.setOn();
        System.out.println("Temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
    }

    private static void tempSensorTest() {
        Sensor tempSensor = new TemperatureSensor();

        try {
            int value = tempSensor.read();
            System.out.println("Temp. Sensor value (should not reach here): " + value);
        } catch (IllegalStateException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        tempSensor.setOn();
        int sensorValue = tempSensor.read();
        System.out.println("Temp. Sensor value when on: " + sensorValue);

        tempSensor.setOff();
        try {
            int value = tempSensor.read();
            System.out.println("Temp. Sensor value (should not reach here): " + value);
        } catch (IllegalStateException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    private static void standardSensorTest() {
        StandardSensor ten = new StandardSensor(10);
        StandardSensor minusFive = new StandardSensor(-5);

        System.out.println("Sensor ten value: " + ten.read());       // Output: 10
        System.out.println("Sensor minus five value: " + minusFive.read()); // Output: -5

        System.out.println("Is Sensor ten on? " + ten.isOn());       // Output: true
        ten.setOff();
        System.out.println("Is Sensor ten still on? " + ten.isOn());
    }
}
