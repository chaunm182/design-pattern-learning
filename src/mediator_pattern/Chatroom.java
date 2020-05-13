package mediator_pattern;

public class Chatroom {
    public static void showMessage(User user,String message){
        System.out.println(user.getName()+" send: "+message);
    }
}
