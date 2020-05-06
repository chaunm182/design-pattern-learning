package proxy_pattern;

public class UserServiceProxy implements UserService {
    UserService userService;
    String user;

    public UserServiceProxy(String user) {
        this.user = user;
        userService = new UserServiceImpl();
    }

    @Override
    public void load() {
        userService.load();
    }

    @Override
    public void insert(String name) {
        if(isAdmin()){
            userService.insert(name);
        }
        else{
            System.out.println("Access denied");
        }
    }

    public boolean isAdmin(){
        return user.equalsIgnoreCase("admin");
    }
}
