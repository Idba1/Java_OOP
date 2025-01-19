public class Cat {
    public String catName;
    public String catColor;
    public int catAge;
    public String action = "Sitting";
    public int x = 10;

    public void changeAction(String action) {
        this.action = action;
    }

    public void method1() {
        int x = 900;
        System.out.println("ml " + x); // local variable
        System.out.println("mi " + this.x); // instance variable
        // this.x = x;
        System.out.println(this);
    }

    public void showCatDetails() {
        System.out.println("Cat name is " + catName);
        System.out.println("Cat color is " + catColor);
        System.out.println("Cat age is " + catAge);
        System.out.println("now this cat " + action);
        // System.out.println("sum of all cat " + x);
    }
}
