public class Tester {
    public static void main(String[] args) {
        SWEStudent swe1 = new SWEStudent("Carel", 2, 3);
        SWEFresher sweF1 = new SWEFresher("Kotlin", 8, 2, "11th January");
        swe1.showDetails();
        swe1.cry();
        System.out.println("------------------");
        sweF1.cry();
        System.out.println("------------------");
        sweF1.showDetails();
        sweF1.orientation();
    }
}