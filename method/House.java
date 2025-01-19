
public class House {
    public String name;
    public int window;
    public int door;
    public String color;

    public void increseDoor(int x) {
        door = door + x;
    }

    public void paintHouse(String clr) {
        color = clr;
    }

    public void view() {
        System.out.println("This House name is " + name);
        System.out.println("This House color is " + color);
        System.out.println("In this house " + window + " windows");
        System.out.println("In this house " + door + " doors");
    }
}