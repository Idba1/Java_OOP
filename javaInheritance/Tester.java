public class Tester {
    public static void main(String[] args) {
        cseStudent s1 = new cseStudent("carel", 6);
        eeeStudent s2 = new eeeStudent("cara", 4);
        cseStudent s3 = new cseStudent("rain", 8);
        s1.showDetails();
        s1.doClass();
        s2.showDetails();
        s2.m1();
        s2.doClass();
        s3.showDetails();
        s3.doLabClass();
    }
}