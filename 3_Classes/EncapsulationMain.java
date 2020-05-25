public class EncapsulationMain {
    public static void main(String[] args) {
        Encapsulation myObj = new Encapsulation();

        // Set the name variable in Encapsulation class using setter:
        myObj.setName("Rui");
        // Access the variable name by using getter:
        System.out.println(myObj.getName());
    }
}
