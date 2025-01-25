public class Tester {
    public static void main(String[] args) {
        Referencing r1 = new Referencing();
        Referencing r2 = new Referencing("Bob", 8);
        r1.name = "caral";
        System.out.println(r2);
        r1.makeCall(r2); // pass by reference
        // r1.makeCall(9);// pass by value
        // r2.showDetails();
    }
}
