public class Tester {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eat();
        // a1.eat(4, 8); //This line gets Compile time Polymorphism || Static Binding
        a1.eat(4);
        a1.eat("dry");
    }
}
