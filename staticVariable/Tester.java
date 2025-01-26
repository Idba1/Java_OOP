public class Tester {
    public static void main(String[] args) {
        System.out.println("team Score-> " + Player.teamRun);
        Player p1 = new Player();
        Player p2 = new Player();
        p1.name = "Sakib";
        // p1.showDetails();
        p1.hit_six();
        p2.hit_six();
        p2.hit_four();
        // p1.showDetails();
        // System.out.println(p1.teamRun + p2.teamRun);
        System.out.println("team Score-> " + Player.teamRun);
        System.out.println("team Score-> " + p2.teamRun);
    }
}
