public class Main {
    public static void main(String[] args) {
        LadyBird a = new LadyBird();
        LadyBird b = new LadyBird();
        Bird c = new Bird();
        Bird d = new Bird();

        a.feed();
        b.feed();
        c.feed();
        d.feed();
        a.fly();
        b.fly();
        c.fly();
        d.fly();
    }
    public void speak() {
        System.out.println();
    }

}
