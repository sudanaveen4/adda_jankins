import java.util.HashMap;
import java.util.Map;

public class Login {

    private static Map<String, String> users = new HashMap<>();

    static {
        users.put("suda", "sudatheking");
        users.put("ram", "198269");
    }

    public static boolean login(String username, String password) {
        String expectedPassword = users.get(username);
        return expectedPassword != null && expectedPassword.equals(password);
    }

    public static void main(String[] args) {
        String username = "suda";
        String password = "sudatheking";

        boolean loggedIn = login(username, password);

        if (loggedIn) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed.");
        }
    }
}