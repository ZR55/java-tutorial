import java.util.ArrayList;
import java.util.Collections;

public class Exercise1 {
    public static ArrayList sortArrayList(ArrayList<String> sourceArrayList) {
        //ArrayList<String> outputArrayList = new ArrayList<String>();
        //outputArrayList = Collections.sort(sourceArrayList);
        Collections.sort(sourceArrayList);
        //return outputArrayList;
        return sourceArrayList;
    }

    public static void main(String[] args) {
        ArrayList<String> testAL = new ArrayList<String>();
        testAL.add("Volvo");
        testAL.add("BMW");
        testAL.add("Ford");
        testAL.add("Kia");

        System.out.println("The sorted ArrayList is: " + sortArrayList(testAL));
    }
}
