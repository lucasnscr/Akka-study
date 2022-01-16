package service;

import domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {

    private final static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1l, "firmino"));
        users.add(new User(2l, "Salah"));
        users.add(new User(3l, "Mane"));
        users.add(new User(4l, "Jota"));
        users.add(new User(5l, "Klopp"));
        users.add(new User(6l, "Virgil"));
    }

    public Optional<User> getUser(Long id){
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public void createUser(User user){
        users.add(user);
    }

    public List<User> getUsers(){
        return users;
    }
}
