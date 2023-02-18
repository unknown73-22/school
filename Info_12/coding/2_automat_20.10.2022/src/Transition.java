
public class Transition {

    public Transition(int intl, int tgt, char a) {
        initial = intl;
        target = tgt;
        c = a;
    }

    int initial;
    int target;
    char c;

    public int getInitial() {
        return initial;
    }

    public int getTarget() {
        return target;
    }

    public char getC() {
        return c;
    }

    public void setInitial(int intl) {
        initial = intl;
    }

    public void setTarget(int tgt) {
        initial = tgt;
    }

    public void setC(char a) {
        initial = a;
    }
}
