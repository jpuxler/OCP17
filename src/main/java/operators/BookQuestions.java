package operators;

public class BookQuestions {

    // 1: A, D, G
    // 2: A, B, D (warum nicht e ? muss explizit auf smaller data type gecastet werden)
    // 3: B, C, D, F
    // 4: E  (B wolf=false ist erlaubt)
    // 5: ?? (A,C: B % E are decreasing. D F G are in neither increasing nor decreasing order of precedence. in D the assignment operator is between two unary operators, with the
    // multiplication operator incorrectly being in place of highest precedence. In option F, the logical complement operator hast the highest order of precende so it should be last.
    // In option G the assignment operators have the lowest order of precedence not the highest so the last two operators should be first.
    // 6: F
    // 7: D
    // 8: A
    // 9: A, D, E
    //10: B, C, F  (G: Error on second line. Even thought both height and weight are cast to byte the multiplication operator automatically promotes them to int.
    //11: D
    //12: E (D: pre-prefix indicates the operation is applied first, and the new value is returned, while post prefix indicates the original value is returen prior to the operation.
    // Next increment increasees the value, while decrement decreases the value.
    //13: F
    //14: E, (B, E, G) B is correct as the equality (==) and inequality (!=) operators can both be used with objects.G is correct as you need to use the negation operator (-)
    // to flip or negate numeric values, not the logcail complement operator (!)
    //15: D
    //16: C (B: 1line: 3 is cast to long. 1 * 2 is evaluated as int but promoted to long when added to the 3. Store long in int triggers a compiler error.
    //17: C, F
    //18: C
    //19: B, F
    //20: D, E  (A: Unary operators have the highest order of precence making option A correct)
    //21: ????? (E: The bitwise complement of 8 can be found by multiplying the number by negative one and subtracting one, making -9 the value of bird. By contrast, plane is -8
    // because it negates myFavoriteNumber. Since bird an dplane are not the same superman is assigned to value of 10. The pre-decrement operator takes superman, subtracts 1,
    // and retuns the new value, printing 9. For this reason option E is correct.



    public static void main(String[] args) {
        test();
    }

    private static void test(){
        int a = 5;
        int b = 10;
        int result;

        // Using unary, binary, and ternary operators
        result = -a * b; // Unary operator (-a) is executed before the binary operator (*)

        System.out.println("Result of -a * b: " + result);

        // Combining with ternary operator
        int c = 2;
        result = a + (c > 1 ? ++b : --b); // Unary operators (++ or --) in the ternary operation are executed before the binary operator (+)

        System.out.println("Result of a + (c > 1 ? ++b : --b): " + result);

    }
}

class Test{
}
