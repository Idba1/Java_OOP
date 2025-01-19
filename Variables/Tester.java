public class Tester {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.catName = "Maklu";
        cat1.catAge = 3;
        cat1.catColor = "black and white mixed";
        cat1.showCatDetails();
        System.out.println("---------------------------");
        cat1.changeAction("Running");
        cat1.showCatDetails();
        System.out.println("---------------------------");
        cat1.method1();
        System.out.println(cat1);
    }
}