public class Exercises {
    // a function to reverse the string:
    public static String reverseString(String txt){
        String outputString = "";
        for (int i = txt.length() - 1; i >= 0; i--) {
            outputString = outputString + txt.charAt(i);
        }
        return outputString;
    }

    public static void main(String[] args) {
        String myTxt = "Hello World!";
        System.out.println(reverseString(myTxt));
    }
}
