package proxy_pattern;

public class Main {
    public static void main(String[] args) {
        String user = "admin";
        UserService userService = new UserServiceProxy(user);
        System.out.println("user: "+user);
        userService.load();
        userService.insert("abc");

        System.out.println("-----------");
        user = "guest";
        UserService userService1 = new UserServiceProxy(user);
        System.out.println("user: "+user);
        userService1.load();
        userService1.insert("abc");
    }
}
