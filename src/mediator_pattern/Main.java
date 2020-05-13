package mediator_pattern;

public class Main {
    public static void main(String[] args) {
        User user = new User("John");
        User user1 = new User("Dần");

        user.sendMessage("Hi");
        user1.sendMessage("Hello");
    }
}
