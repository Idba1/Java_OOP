public class Abc {
    public int temp; // instance variable
    public static int x = 4; // static variable

    public Abc(int value) {
        temp = value;
    }

    public void method1() {
        int temp = 100; // local variable
        int x = 200; // local variable
        System.out.println(temp);
        System.out.println(x);
        System.out.println(this.temp); // instance variable
        System.out.println(this.x); // instance variable
        System.out.println(Abc.x); // instance variable
        System.out.println("-----------------");
    }
}
