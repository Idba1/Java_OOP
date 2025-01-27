public class Tester {
    public static void main(String[] args) {
        Dog d1 = new Dog("Rover", "white");
        Cat cat1 = new Cat();
        d1.bark();
        d1.eat();
        cat1.poke();
        System.out.println(d1);
        // System.out.println(d1.toString());
        System.out.println(cat1);
        cat1.toString();
    }
}
