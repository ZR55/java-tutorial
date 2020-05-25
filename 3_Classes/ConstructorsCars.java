public class ConstructorsCars {
    // Create class attributes:
    int modelYear;
    String modelName;

    // Create constructor with as many parameters as you want:
    public ConstructorsCars(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        ConstructorsCars myCar = new ConstructorsCars(2013, "Ford");
        System.out.println("I have a " + myCar.modelYear + " " + myCar.modelName);
    }
}
