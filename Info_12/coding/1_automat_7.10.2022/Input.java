import java.io.*;
import java.util.*;

public class Input {

    static ArrayList<String> list = new ArrayList<String>();

    public void console() {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        String s = "";
        int j = 0;

        try {
            System.out.println("insert number of Strings you want to insert");
            j = Integer.parseInt(b.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i=0; i<j; i++) {
            try {
                System.out.println("insert word with ∑={'A', 'B', 'C', 'D', 'E'}");
                s = b.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            list.add(s);
        }
    }
}

/*
 * Console c = System.console();
 * if (c == null) {
 * System.err.println("Keine Konsole erreichbar!");
 * return;
 * }
 * int j =
 * Integer.parseInt(c.readLine("insert number of Strings you want to insert"));
 * for (int i = 0; i < j; i++) {
 * String s = c.readLine("insert word with ∑={'A', 'B', 'C', 'D', 'E'}");
 * list.add(s);
 */
/*
 * Scanner scan = new Scanner(System.in);
 * 
 * System.out.println("insert number of Strings you want to insert");
 * 
 * int j = Integer.parseInt(scan.nextLine());
 * for (int i = 0; i < j; i++) {
 * System.out.println("insert word with ∑={'A', 'B', 'C', 'D', 'E'}");
 * String s = scan.nextLine();
 * list.add(s);
 */