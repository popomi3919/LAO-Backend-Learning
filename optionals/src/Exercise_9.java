package optionals.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class User{
    private long id;
    private String name;
    public User(long id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Optional<User> findById(long id, List<User> users){
        for (User u : users){
            if (id == u.id){
                return Optional.of(u);
            }
        }
        return Optional.empty();
    }

    public static String displayUser(long id, List<User> user){
        String resultat = User.findById(id, user)
                .map(User::getName).orElse("Utilisateur Introuvable");
        return resultat;
    }
}

public class Exercise_9 {
    public static void main(String[] args){
        List<User> users = new ArrayList<>();
        users.add(new User(20, "John"));
        users.add(new User(60, "Elton"));
        users.add(new User(50, "Booth"));
        users.add(new User(40,"Ryan"));

        User.findById(60, users);
        System.out.println(User.displayUser(60, users));

        User.findById(30, users);
        System.out.println(User.displayUser(30, users));
    }
}
