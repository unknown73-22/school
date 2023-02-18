public class Test {
    int zustand = 0;

    public  boolean testing(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++)
            insert(charArray[i]);
        if (zustand == 5) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public  void insert(char c) {
        switch (zustand) {
            case 0:
                switch (c) {
                    case 'A':
                        zustand = 1;
                        break;
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                        zustand = 0;
                        break;
                    default:
                    zustand = -1;
                        break;
                }
                break;
            case 1:
                switch (c) {
                    case 'C':
                        zustand = 2;
                        break;
                    case 'A':
                        zustand = 1;
                        break;
                    case 'B':
                    case 'D':
                    case 'E':
                        zustand = 0;
                        break;
                    default:
                    zustand = -1;
                        break;
                }
                break;
            case 2:
                switch (c) {
                    case 'A':
                        zustand = 3;
                        break;
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                        zustand = 0;
                        break;
                    default:
                    zustand = -1;
                        break;
                }
                break;
            case 3:
                switch (c) {
                    case 'E':
                        zustand = 4;
                        break;
                    case 'A':
                        zustand = 1;
                        break;
                    case 'B':
                    case 'C':
                    case 'D':
                        zustand = 0;
                        break;
                    default:
                    zustand = -1;
                        break;
                }
                break;
            case 4:
                switch (c) {
                    case 'A':
                        zustand = 5;
                        break;
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                        zustand = 0;
                        break;
                    default:
                    zustand = -1;
                        break;
                }
                break;
            case 5:
                switch (c) {
                    case 'C':
                        zustand = 2;
                        break;
                    case 'A':
                        zustand = 1;
                        break;
                    case 'B':
                    case 'D':
                    case 'E':
                        zustand = 0;
                        break;
                    default:
                        zustand = -1;
                        break;
                }
                break;
            default:
                break;
        }
    }
}
