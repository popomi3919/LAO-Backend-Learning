package optionals.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class User{
    long id;
    String name;
    public User(long id, String name){
        this.id = id;
        this.name = name;
    }

    public  static void displayResult(long id){

    }

    public static Optional<User> findById(long id){
        List<User> listOfUser = new ArrayList<>();
        listOfUser.add(new User(1,"John"));
        listOfUser.add(new User(2,"Roy"));
        listOfUser.add(new User(3,"Jean"));
        listOfUser.add(new User(4,"Pierre"));
        for (User u : listOfUser){
            if (id == u.id){
                return Optional.of(u);
            }
        }
        return Optional.empty();
    }
}

public class Exercise_9 {
    public static void main(String[] args){
        System.out.println(User.findById(3));
    }
}
