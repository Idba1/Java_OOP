public class Tester {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        // d1.name = "Dollar";
        // d1.showDetails();
        // // d1.bark();
        // d1.bark();

        d2.name = "Rover";
        d2.bark();
        d2.eat("Dog Food"); // one string parameter
        d2.eat(9);
        d2.eat("Dog Food", 6); // multiple parameter
        d2.eat("Dog Food", "Chicken"); // different data typ
    }
}