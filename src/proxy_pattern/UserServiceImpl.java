package proxy_pattern;

public class UserServiceImpl implements UserService {
    @Override
    public void load() {
        System.out.println("Loaded");
    }

    @Override
    public void insert(String name) {
        System.out.println("Inserted: "+name);
    }
}
