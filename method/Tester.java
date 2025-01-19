public class Tester {
    public static void main(String[] args) {
        House House1 = new House();
        House House2 = new House();
        House1.name = "Mannat";
        House1.door = 9;
        House1.window = 45;
        House1.color = "White";

        House1.increseDoor(89);
        House2.door = 20;
        House2.increseDoor(100);
        House1.view();
        System.out.println("------------------------");
        House1.paintHouse("Black");
        House1.increseDoor(599);
        House1.view();
        // House2.view();
    }
}
