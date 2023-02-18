public class User {
    
    protected Server server;

    public User(Server s) {
        server = s;
    }

    public void nachrichtToSever(String s) {
        server.nachrichtVerarbeiten(s);
    }
}
