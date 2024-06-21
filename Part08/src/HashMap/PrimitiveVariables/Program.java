package HashMap.PrimitiveVariables;

import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1, "Ole");
        System.out.println(hashmap.get(1));
        // HashMap<int, String> map2 = new HashMap<>() does not work
        // int -> Integer
        // double -> Double
        // char -> Character

        int key = 2;
        HashMap<Integer, Integer> hashmap2 = new HashMap<>();
        hashmap2.put(key, 10);
        int value = hashmap2.get(key);
        System.out.println(value);
    }
}
