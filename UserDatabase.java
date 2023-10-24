import java.util.HashMap;
import java.util.Map;

public class UserDatabase {
    private Map<String, String> users;

    public UserDatabase() {
        users = new HashMap<>();
        // Add some default users
        users.put("user1", "password1");
        users.put("user2", "password2");
    }

    public boolean isValidUser(String username, String password) {
        String storedPassword = users.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }
}
