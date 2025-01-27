public class B extends A {
    public static int x = 20;
    public int y = 25;

    public void m1() {
        int y = 45;
        System.out.println(y); // local -> own instance -> parent instance
        System.out.println(this.y); // own instance -> parent instance
        System.out.println(super.y); // parent instance
    }

    public void m2() {
        int x = 45;
        System.out.println(x); // local -> own instance/ static -> parent instance/static
        System.out.println(this.x); // own instance/ static -> parent instance/static
        System.out.println(super.x); // parent instance/static
        System.out.println(B.x); // own static -> parent static
        System.out.println(A.x); // parent static
    }

    public void m3(){
        System.out.println(y);
        System.out.println(this.y);
    }
}
