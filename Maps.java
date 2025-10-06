// Maps.java
// XS 9/30/25

import java.util.HashMap;



public class Maps {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Add items
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Update an item
        map.put(2, "Blueberry");

        System.out.println(map); // {1=Apple, 2=Blueberry, 3=Cherry}

        String fruit = map.get(1);
        System.out.println(fruit); // Apple

        System.out.println(map.get(99)); // null

        map.remove(3);
        System.out.println(map); // {1=Apple, 2=Blueberry}

        System.out.println(map.containsKey(2));    // true
        System.out.println(map.containsValue("Cherry")); // true
        System.out.println(map.containsValue("Banana")); // false (it was updated)

        System.out.println(map.size());    // 2
        System.out.println(map.isEmpty()); // false




    }

}
