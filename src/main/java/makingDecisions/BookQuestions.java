package makingDecisions;

import java.util.ArrayList;
import java.util.List;

public class BookQuestions {

    // 1: A, B, C, E, F
    // 2: B
    // 3: A, D, F
    // 4: C
    // 5: E
    // 6: A, D, E, F
    // 7: B, D,
    // 8: A
    // 9: B, C, E
    //10:
}

class Test{
    public static void main(String[] args) {
        test();
    }

    private static void test(){

        int count = 0;
        BUNNY: for(int row = 1; row <= 3; row++)
            RABBIT: for(int col = 0; col < 3; col++) {
                if ((col + row) % 2 == 0)
                    continue;
                count++;
            }
        System.out.println(count);
    }
}
