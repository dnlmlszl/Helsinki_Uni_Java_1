package OOP;

public class PersonBMINewSyntax {
    record Person(String name, int height, int weight, int age) {
        public Person updatedData(int newHeight, int newWeight) {
            return new Person(name, newHeight, newWeight, age);
        }

        public double bodyMassIndex() {
            double heightPerHundred = height / 100.0;
            return weight / (heightPerHundred * heightPerHundred);
        }
    }

    public static void main(String[] args) {
        var matti = new Person("Matti", 0, 0, 30);
        var juhana = new Person("Juhana", 0, 0, 27);

        matti = matti.updatedData(180, 86);
        juhana = juhana.updatedData(175, 64);

        // Instead of generating toString() method, record generates it automatically
        System.out.println("Automatic generated toString():");
        System.out.println(matti);
        System.out.println(juhana);
        System.out.println();
        System.out.printf("%s is %d years old and has a body mass index is: %.2f\n", matti.name(), matti.age(), matti.bodyMassIndex());
        System.out.printf("%s, is %d years old and has a body mass index is: %.2f\n", juhana.name(), juhana.age(), juhana.bodyMassIndex());
    }
}
