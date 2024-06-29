package UsefulTechniques.EnumAndIterator;

public class Main {
    public static void main(String[] args) {

        Employees university = initializeOrganization();

        university.print();

        university.fire(Education.HS);

        System.out.println("===========");

        university.print();

    }

    private static Employees initializeOrganization() {
        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));
        return university;
    }
}
