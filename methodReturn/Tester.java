public class Tester {
    public static void main(String[] args) {
        myCalculator r1 = new myCalculator();
        // r1.result = 33;
        // System.out.println(r1.result);
        // System.out.println(r1.add1(6, 6)); //error for void typ
        r1.add1(6, 6); //this will execute
        int ans = r1.add2(9, 5);
        System.out.println("from T " + ans);
        System.out.println(r1.add2(5, 8));

        // int z = 8 + r1.add1(7, 6); //void typ method call. it's get error
        int z2 = r1.add2(7, 8) + 8 + 2 + r1.add2(7, 8); // int typ method
        System.out.println(z2);
        System.out.println(r1.add2(78, 89));
        // System.out.println(r1.add1(9, 1)); //get error
        r1.add1(9, 1);
    }
}