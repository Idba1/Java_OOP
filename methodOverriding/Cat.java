public class Cat extends Dog {
    public Cat() {
        super("cat", "black");
        System.out.println("Cat Class Calling");
    }

    public void eat(){ //method overriding
        System.out.println("cat eating milk");
    }
}