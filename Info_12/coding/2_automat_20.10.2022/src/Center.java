
import java.util.ArrayList;

public class Center {

    public Center() {

    }

    int status = 0;
    ArrayList<Transition> transitions = new ArrayList<Transition>();
    ArrayList<Integer> finals = new ArrayList<Integer>();
    int count = 0;
    int initial = 0;
    int finale = 0;
    Transition currentTransition;
    int text1 = -1;
    char text2 = ' ';
    int text3 = -1;

    public void input(char c) {
        for (Transition t : transitions) {
            if (t.getInitial() == status && t.getC() == c) {

                status = t.getTarget();
                break;
            } else {
                status = -1;
            }
        }
    }

    public boolean test(String s) {
        setStatus();
        char[] charArray = s.toCharArray();
        for (char c : charArray)
            input(c);
        if (finals.contains(status)) {
            return true;
        } else {
            return false;
        }
    }

    public void result(String s) {
        boolean b = test(s);
        if (b == true) {
            System.out.println("The word is in the alphabet");
        } else {
            System.out.println("The word isn't in the alphabet");
        }
    }

    /**
     * 
     */
    public void button1Action() {
        text1 = Integer.parseInt(Window.textField1.getText());
        text2 = Window.textField2.getText().charAt(0);
        text3 = Integer.parseInt(Window.textField3.getText());
        Transition transition2add = new Transition(text1, text3, text2);
        transitions.add(transition2add);
        text1 = -1;
        text2 = ' ';
        text3 = -1;
        /*
         * transitions.add(new Transition(Integer.parseInt(Window.textField1.getText()),
         * Integer.parseInt(Window.textField3.getText()),
         * Window.textField2.getText().charAt(0)));
         */
        Window.textField1.setText("");
        Window.textField2.setText("");
        Window.textField3.setText("");
        System.out.println("New Transition added");
        count++;
    }

    public void button2Action() {
        finals.add(Integer.parseInt(Window.textField4.getText()));
        Window.textField4.setText("");
        System.out.println("New final condition");
    }

    public void button3Action() {
        result(Window.textField5.getText());
        Window.textField5.setText("");
    }

    public void button4Action() {
        int z = 1;
        int n = 0;

        for (Transition integer : transitions) {
            System.out.println(integer.getInitial());
        }
        System.out.println(transitions.get(0).getInitial());
        System.out.println(transitions.get(0).getC());
        System.out.println(transitions.get(0).getTarget());
        System.out.println(transitions.get(1).getInitial());
        System.out.println(transitions.get(1).getC());
        System.out.println(transitions.get(1).getTarget());
        while (n < transitions.size() + 1) {
            currentTransition = transitions.get(n);
            System.out.println("The " + z + ". transition is from " + currentTransition.getInitial() + " with "
                    + currentTransition.getC() + " to "
                    + currentTransition.getTarget() + ".");
            z++;
            n++;
        }
    }

    public void button5Action() {
        System.out.println(status);
    }

    private void setStatus() {
        higherLower();
        if (count == 1) {
            if (initial > status || finale > status) {
                if (initial >= finale) {
                    status = initial;
                } else {
                    status = finale;
                }
            } else {
                if (initial < status || finale < status) {
                    if (initial <= finale) {
                        status = initial;
                    } else {
                        status = finale;
                    }
                }
            }
        }
    }

    private void higherLower() {
        for (Transition t : transitions) {
            if (initial >= t.getInitial()) {
                initial = t.getInitial();
            }
            if (finale >= t.getTarget()) {
                finale = t.getTarget();
            }
        }
    }
}
