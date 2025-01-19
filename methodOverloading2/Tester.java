public class Tester {
    public static void main(String[] args) {
        myCalculator calc = new myCalculator();
        System.out.println(calc.add(5, 6));
        System.out.println("---------------------");
        System.out.println(calc.add(5, 6, 9));
        System.out.println("---------------------");
        System.out.println(calc.add(5.11, 6, 9));
        System.out.println("---------------------");
        System.out.println(calc.add(5.78, 6.11, 9));
        System.out.println("---------------------");
        calc.add("OOP", 221);
        System.out.println("---------------------");
        System.out.println(calc.add("Rayan", "Jaynik"));
    }
}
