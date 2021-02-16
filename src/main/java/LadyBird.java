public class LadyBird implements Flying, Feed {

    String name;
    boolean isFemale;

    @Override
    public String fly() {
        return "Buzz, Buzz";
    }

    @Override
    public String feed() {
        return "I love aphid";
    }

}
