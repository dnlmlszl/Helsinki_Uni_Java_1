package HashmapProjects.Nicknames;

import java.util.HashMap;

public class NickNames {
    public static void main(String[] args) {
        HashMap<String, String> people = new HashMap<>();
        people.put("Mathew", "Matt");
        people.put("Michael", "Mix");
        people.put("Arthur", "Artie");

        System.out.println(people.get("Mathew"));
    }
}
