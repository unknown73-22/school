import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Input input = new Input();
        Test test = new Test();
        input.console();

        if (input.list.size() != 0) {
            for (int i = 0; i < input.list.size(); i++)
                test.testing(input.list.get(i));
        }
    }
}
