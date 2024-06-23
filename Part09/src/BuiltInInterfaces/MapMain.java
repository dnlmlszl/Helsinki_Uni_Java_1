package BuiltInInterfaces;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> maps = new HashMap<>();
        maps.put("ganbatte", "good luck");
        maps.put("hai", "yes");

        for (String key : maps.keySet()) {
            System.out.println(key + ": " + maps.get(key));
        }

        System.out.println(returnSize(maps));
    }

    private static int returnSize(Map<String, String> maps) {
        return maps.size();
    }
}
