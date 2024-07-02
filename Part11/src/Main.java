//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public void main(String[] args) {
        Person person = new Person("Ada");
        person.printPerson();
    }
    public class Person {
        private String name;
        private int age;
        public Person(String initialName) {
            this.name = initialName;
            this.age = 0;
        }
        public void printPerson() {
            System.out.println(this.name + ", age " +   this.age + " years");
        }
        public String getName() {
            return this.name;
        }
    }
}

/*
Person
- name: String
- age: int
+ Person(initialName: String)
+ printPerson(): void
+ getName(): String
*/