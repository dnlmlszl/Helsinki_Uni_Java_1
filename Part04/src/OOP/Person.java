package OOP;
public class Person {
    private final String name;
    private int age;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }


    public void printPerson() {
        System.out.printf("%s, age %d years\n", this.name, this.age);
    }

    public void growOlder() {
        if (this.age < 30) {
            this.age += 1;
        }
    }

    public String returnName() {
        return this.name;
    }

    public int returnAge() {
        return this.age;
    }

    public boolean isOfLegalAfe() {
        return this.age >= 18;
    }

    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}

