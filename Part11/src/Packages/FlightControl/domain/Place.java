package Packages.FlightControl.domain;

public class Place {
    private String ID;
    public Place(String ID) {
        this.ID = ID;
    }
    @Override
    public String toString() {
        return String.format("%s", this.ID);
    }
}
