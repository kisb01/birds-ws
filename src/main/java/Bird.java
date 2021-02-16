public class Bird implements Flying, Feed{

    String name;
    boolean isFemale;

    @Override
    public String fly() {
        return "Csájp, Csájp";
    }

    @Override
    public String feed() {
        return "What a wonderful worm";
    }

}

//        Create a Bird class with a name, and isFemale field
//        Create a LadyBird class with a name and isFemale field
//        Create a Flying interface with a method void fly()
//        Bird and LadyBird must implement Flying
//        When Bird flies, it “says” Csájp, Csájp
//        When LadyBird flies, it says “Buzz, Buzz”
//        Implement feed() method in both classes.
//        When LadyBird feeds it says: “I love aphid”
//        When Bird feeds it says, “What a wonderful worm”
//        When I say “says” call speak()
//        Did you create Feed Interface already? Than it is time:)
//        Call fly() on 2 LadyBird and 2 Bird in Main with a method: feed()
//        Call feed() on 2 LadyBird and 2 Bird in Main with a method: feed()
