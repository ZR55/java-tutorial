/* HashMap */
// A HashMap stores items in "key/value" pairs, and you can access them by an
// index of another type.

import java.util.HashMap; // import HashMap class

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // put() method to add keys and values:
        capitalCities.put("England", "London");
        capitalCities.put("China", "Beijing");
        capitalCities.put("Germany", "Berlin");
        System.out.println(capitalCities);

        // get(key) to access a value:
        System.out.println(capitalCities.get("China"));

        // size() to get the size of the HashMap:
        System.out.println("The size of capitalCities is: " + capitalCities.size());

        // Loop through the items of a HashMap with a for-each loop:
        // Use "keySet()" to only access the keys, "values()" for only values.
        for (String key : capitalCities.keySet()) {
            System.out.println(key);
        }
        for (String value : capitalCities.values()) {
            System.out.println(value);
        }
        // print out both key and values:
        for (String key : capitalCities.keySet()) {
            System.out.println("The capital city for " + key + " is " + capitalCities.get(key));
        }

        // remove(key) to remove an element in HashMap:
        capitalCities.remove("Germany");
        System.out.println("After removing: " + capitalCities);

        // clear() to remove all the elements:
        capitalCities.clear();
        System.out.println("After clearing: " + capitalCities);
    }
}
