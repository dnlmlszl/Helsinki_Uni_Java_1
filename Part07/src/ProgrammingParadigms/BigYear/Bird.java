package ProgrammingParadigms.BigYear;

public class Bird {
    private final String name;
    private final String latinName;
    private int observations;
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }
    public void observe() {
        this.observations++;
    }
    public String getName() {
        return name;
    }
    public String getLatinName() {
        return latinName;
    }
    public int getObservations() {
        return observations;
    }
    @Override
    public String toString() {
        return String.format("%s: (%s): %d observations", name, latinName, observations);
    }
}
