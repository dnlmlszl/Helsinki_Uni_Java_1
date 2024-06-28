package CollectionsAsStreams.Exercises.WageOrder;

public class Human implements Comparable<Human>{
    private String name;
    private int wage;
    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }
    public String getName() {
        return name;
    }
    public int getWage() {
        return wage;
    }
    @Override
    public String toString() {
        return String.format("%s (%d $)", this.name, this.wage);
    }
    @Override
    public int compareTo(Human human) {
        return Integer.compare(this.wage, human.getWage());
    }
}
