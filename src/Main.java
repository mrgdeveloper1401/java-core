import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username;
        String password;
        String u;
        String p;
        username = "admin";
        password = "admin";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Username: ");
        u = input.next();
        System.out.print("Enter Password: ");
        p = input.next();

        if (u.equals(username) && p.equals(password)) {
            System.out.println("Successfully Login: " + username);
        }else {
            System.out.print("Invalid username or password");
        }
    }
}
