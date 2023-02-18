import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Server {

    public Server() {
        registeredUser = new HashMap<String, String>();
    }

    String zustand = "ready";
    String adminpw = "1234";
    String geheim = "classified document";
    String benutzername;
    HashMap<String, String> registeredUser;
    Input inpt = new Input();
    boolean UserNameUsed = false;

    public void nachrichtVerarbeiten(String s) {
        switch (zustand) {
            case "ready":
                zstdReady();
                break;
            case "login":
                break;
            case "insertPassword":
                break;
            case "loggedIn":
                break;
            case "insertNameNewUser":
                break;
            case "insertPasswordnewUser":
                break;
            default:
                break;
        }
    }

    public void addUser() {
        server.setZustand("adminPwRequired");
    }

    public void setZustand(String zstd) {
        zustand = zstd;
    }

    public void zstdReady() {
        inpt.inputReady();
        switch (inpt.getInput()) {
            case "hallo":
                zustand = "login";
                break;
            case "adduser":
                addUser();
                break;
            default:

                break;
        }
    }

    public void zstdLogin() {
        inpt.inputLogin();
        benutzername = inpt.getInput();
    }

    public void zstdInsertPassword() {
        try {
            registeredUser.get(benutzername);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void zstdLoggedIn() {
        switch (inpt.getInput()) {
            case "secret":
                System.out.println(geheim);
                break;
            case "logout":
                zustand = "ready";
                break;
            default:

                break;
        }
    }

    public void zstdInsertNameNewUser() {
        switch (UserNameUsed) {
            case false:

                break;

            default:
                break;
        }
    }

    public void zstdInsertPasswordNewUser() {

    }

    public boolean usernameUsed() {

        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }

        if(benutzername ==  ) {
            
        }
    }
}