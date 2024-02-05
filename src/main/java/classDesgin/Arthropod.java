package classDesgin;

public class Arthropod {
    protected void printName(long input) {
        System.out.println("Arhropod");
    }

    void printName(int input) {
        System.out.println("Spooky");
    }
}

class Spider extends Arthropod {
    protected void printName(int input) {
        System.out.println("Spider");
    }

    public static void main(String[] args) {
        Arthropod a = new Spider();
        a.printName((short) 4);
        a.printName(4);
        a.printName(5L);
    }
}
