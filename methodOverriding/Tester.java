public class Tester {
    public static void main(String[] args) {
        Dog d1 = new Dog("Rover", "white");
        d1.bark();
        d1.eat(11);
        d1.eat();
        Cow cow1 = new Cow();
        cow1.eat();
        Cat cat1 = new Cat();
        cat1.eat();
    }
}
