public class Dog {
    public String name;

    public void showDetails() {
        System.out.println("Dog name is " + name);
    }

    public void bark() {
        System.out.println(name + " is braking");
    }

    public void eat(String foodName) {
        System.out.println(name + " is eating " + foodName);
    }

    public void eat(int numberOfFood) {
        System.out.println("number of quantity " + numberOfFood);
    }

    // when java design class have same name multiple method, with different number
    // of
    // parameter || different data type then, we call it method overloading. in this
    // code eat() is methodOverloading.

    public void eat(String foodName, int numberOfFood) {
        System.out.println(name + " is eating " + numberOfFood + " " + foodName);
    }

    public void eat(String foodName, String foodName2) {
        System.out.println(name + " is eating " + foodName2 + " and " + foodName);
    }
}

// same name
// multiple parameter
// different data type