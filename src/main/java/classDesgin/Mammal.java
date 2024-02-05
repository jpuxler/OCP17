package classDesgin;

public class Mammal {

    private void sneeze() {
    }

    public Mammal(int age) {
        System.out.println("Mammal");
    }
}

class Platypus extends Mammal {
    int sneeze() {
        return 1;
    }

    public Platypus() {
        super(5);
        System.out.println("Platypus");
    }

    public static void main(String[] args) {
        new Mammal(5);
    }
}
