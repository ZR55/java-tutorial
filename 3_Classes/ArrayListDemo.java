/* ArrayList */
// The ArrayList class is a resizable array, which can be found in the java.util

// Difference between array and ArrayList:
// Elements can be added and removed from an ArrayList whenever you want, while
// the size of an array cannot be modified.

import java.util.ArrayList; // import the ArrayList class
import java.util.Collections; // import the Collections class

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList:
        ArrayList<String> cars = new ArrayList<String>();
        // For the other types of ArrayList, you need to have the same format
        // wrapper (Integer, Boolean, Character, Double).

        // add(value) method:
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // get(index) method to access ArrayList element:
        System.out.println(cars.get(0));

        // set(index, value) method to change ArrayList element:
        cars.set(2, "BMW");
        System.out.println("After changing element: " + cars);

        // remove(index) method to remove ArrayList element:
        cars.remove(2);
        System.out.println("After removing element: " + cars);

        // size() method to see how many elements are in the ArrayList:
        System.out.println("Element numbers: " + cars.size());

        // Loop through an ArrayList:
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Kia");
        for (String car : cars) {
            System.out.println(car);
        }

        // sort() method in Collections class in java.util package is used to
        // sort ArrayList alphabetically or numerically.
        Collections.sort(cars);
        System.out.println("After sorting: " + cars);

        // clear() method to remove all the element in the ArrayList:
        cars.clear();
        System.out.println("After clear(): " + cars);

    }
}


// Rui's notes:
// - it seems like Collections.sort() sorts the ArrayList in place.
