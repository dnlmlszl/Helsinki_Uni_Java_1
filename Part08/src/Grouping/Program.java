package Grouping;

import java.util.ArrayList;
import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneNumbers = new HashMap<>();
        phoneNumbers.put("Pekka", new ArrayList<>());

        phoneNumbers.get("Pekka").add("040-12348765");
        phoneNumbers.get("Pekka").add("09-111333");

        System.out.println("Pekka's numbers: " + phoneNumbers.get("Pekka"));
    }
}
