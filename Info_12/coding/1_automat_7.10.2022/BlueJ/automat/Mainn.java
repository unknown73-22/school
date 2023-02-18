public class Mainn {
    String s;

    int zustand = 0;

    public boolean test(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            input(charArray[i]);
        }
        return zustand == 5;
    }

    public void input(char c) {
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
                        break;
                }
                break;
            default:
                System.out.println("You are dumb!");
                break;
        }
    }
}