package ObjectsAndReferences;

public class HealthStation {
    private int measuring;
    public HealthStation() {}
    public int weigh(Person person) {
        measuring++;
        return person.getWeight();
    }
    public void feed(Person person) {
        int newWeight = person.getWeight() + 1;

        if (newWeight >= 0) {
            person.setWeight(newWeight);
        }
    }
    public int weighMeasuring() {
        return measuring;
    }
}
