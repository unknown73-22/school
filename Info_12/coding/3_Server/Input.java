import java.io.*;

public class Input {

    BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

    String input = "";

    public void inputReady() {
        try {
            System.out.println(
                    "Please insert a command. ('Hallo' -> login; 'addUser' -> addUser (admin password required!)");
            input = b.readLine().toLowerCase();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inputLogin() {
        try {
            System.out.println("Please insert a username.");
            input = b.readLine().toLowerCase();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inputInsertPassword() {
        try {
            System.out.println("Please insert the password.");
            input = b.readLine().toLowerCase();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inputLoggedIn() {
        try {
            System.out.println("Insert a command. ('secret' -> receive classified document; 'logout'-> logout)");
            input = b.readLine().toLowerCase();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inputLoggedIn2() {
        try {
            System.out.println("Insert a valid command. ('secret' -> receive classified document; 'logout'-> logout)");
            input = b.readLine().toLowerCase();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inputAdminPwrequired() {
        try {
            System.out.println("Please insert a admin password.");
            input = b.readLine().toLowerCase();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inputInsertNameNewUser() {
        try {
            System.out.println("Please insert a name for the new user.");
            input = b.readLine().toLowerCase();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inputinsertPasswordnewUser() {
        try {
            System.out.println("Please set a password for the new user.");
            input = b.readLine().toLowerCase();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getInput() {
        return input;
    }
}
