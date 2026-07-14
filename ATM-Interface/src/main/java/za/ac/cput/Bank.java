package za.ac.cput;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    //I use Map to store users like your UserId & User object
    private Map<String, User> users;

    public Bank() {
        users = new HashMap<>();
        users.put("12345", new User("12345","2324",2000));
    }

    //Here we check if userId exists and that the password is correct
 public User authenticate(String userId , String password) {
        User user = users.get(userId);
        if(user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
 }

 //Retrieve a user by ID
 public User getUser(String userId) {
        return users.get(userId);
 }

}
