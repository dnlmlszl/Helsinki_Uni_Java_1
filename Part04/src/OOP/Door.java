package OOP;

public class Door {
    private final String door;

    public Door() {
        this.door = "Who is there?";
    }

    public void knock() {
        System.out.println(this.door);
    }
}

/*
*
* Alternative solution
public class Door {
    // The class just works pretty fine without any constructors
    public Door() {}

    public void knock() {
        System.out.println("Who's there?");
    }
}
*
**/