package makingDecisions;

public class BookQuestions {

    // 1: A, B, C, E, F  (G: switch supports var if the type can be resolved to a supported switch data type)
    // 2: B
    // 3: A, D, F  (H: A for-each loop also supports classes that implement java.lang.Iterable.)
    // 4: C  (-C, F) The Code does not compile because the switch expression requires all possible case values to be handled, making option F correct. If a valid default statement was added,
    //then the code would compile and print Turtle at runtime. Unlike traditional switch statements, switch expressions execute exactly one branch and do not use break statements between case
    //statements.
    // 5: E
    // 6: A, D, E, F (-A, C) A for-each loop can be executed on any Collections object that implements java.lang.Iterable, such as List or Set, but not all Collections classes, such as Map
    //so option A is incorrect. The conditional expression of for loops is evaluated at the start of the loop execution, meaning the for loop may execute zero or more times, making option
    // C correct.
    // 7: B, D,
    // 8: A (-A, G) The first two pattern matching statements compile without issue. The variable bat is allowed to be used again, provided it is no longer in scope. Line 36 does not compile,
    // though. Due to flow scoping, if s is not a Long, then bat is not in scope in the expression bat <= 20. Line 38 also does not compile as default cannot be used as part of an if/else statement.
    //For these two reasons, option G is correct.
    // 9: B, C, E
    //10: B (-B, E) This code contains numerous compilation errors, making options A and H incorrect. Line 15 does not compile, as continue cannot be used inside a switch statement like this.
    // Line 16 is not a compile-time constant since any int value can be passed as a parameter. Making it final does not change this, so it doesn't ocmpile. Line 18 does not compile because
    // Sunday is not marked as final. Being effetively final is insufficient. Finally, line 19 does not compile because DayOfWeek.MONDAY is not an int value. While switch statements do support
    // enum values, each case statement must have the same data type as the switch variable otherDay, which is int. The rest of the lines do compile. Since exactly four lines do not compile,
    // option E is the correct answer.
    //11: A
    //12: C
    //13: G
    //14: B, D, F
    //15: A (-A, F) The code does not compile, although not for the reason specified in option E. The second case statement contains invalid syntax. Each vase statemtn must have the keyword case
    // in other words, you cannot chain them with a colon (:). For this reason, option F is the correct answer. This line could have been fixed to say case 'B', 'C', or by adding the case
    // keyword before 'c'; then the rest of the code would have compiled and printed great good at runtime.
    //16: A, B, D,
    //17: B, E
    //18: ???? (C,E) Pattern mathcing with an if statement is implemented using the instaceof operator, making option C correct and options A and B incorerect. Option D is incorrect as it is
    // possible to acces a pattern variable outside the if statement about flow scoping. Option F is incorrect. Pattern mathcing does not support declaring variables in else statements as
    // else statements do not have a boolean expression.
    //19: E
    //20: A, C, E (-C) The msot important thin to notice when reading this code is that the innermost loop is an infinite loop. Therefore, you are looking for solutions that skip innermost
    // loop entirely or that exit that loop. Option A is correct, as break L2 on line 8 causes the second inner loop to exit every time it is entered, skipping the innermost loop entirely.
    // For option B, the first continue on line 8 causes the execution to skiop the innermost loop on the first iteration of the second loop but not the second iteration of the second loop.
    // The innermost loop is executed, and with continue on line 12, it procudes an infinite loop at runtime, making option B incorrect. Option C is incorrect bceause it contains a compiler
    // error. The label L3 is not visibile outside its loo. Option D is incorrect, as it is equivalent to option B since the unlabeled break and continue apply to the nearest loop and therefore
    // produce an infinite loop at runtime. Like option A, the continue L2 on line 8 allows the innermost loop to be executed the second time the second loop is called. The ocntinue L2 on the
    // line 12 exits the infinite loop, though, causing control to return to the second loop. Since the first and second loops terminate, the code terminates, and option E is a correct answer.
    //21: C (-C, E)Line 22 does not compile because Long is not a compatible type for a switch statemetn or expression. Line 23 does not compile because it is missing a semicolon after "Jane"
    // and a yield statement. Line 24 does not compile because it contains an extra semicolon at the end. Finally, lines 25 and 26 do nto compile because they use the same case value. At
    // least one of them would need to be chaged for the code to compile. Since four lines need to be corrected, option E is correct.
    //22: E
    //23: A (-A, F) Lien 19 starts with an else statement, but there is no preceding if statement that it matches. For this reason, line 19 does not compile, making Option F the correct answer.
    // If the else keyword was removed from line 19, then the code snippet would print Success.
    //24: D (-D, G) The staement is not a valid for-each loop(or a traditional for loop) since it uses a nonexistent in keyword. For this reason, the code does not compile, and option G is correct.
    // If the in was changed to a colon (:), then Set, int[], and Collection would be correct.
    //25: B (-B, D) The code compiles without issue, so option F is incorrect. The viola variable created on line 8 is never used and can be ignored. If it had been used as the case value on
    // line 15, it would have caused a compilation error since it is not marked final. Since "violin" and "VIOLIN" are not an exact match, the dafault branch of the switch satement is
    // executed at runtime. This execution path increments p a total of three times, bringing the final value of p to 2 and making option D th ecorrect answer.
    //26: ? (F) The code snippet does not contain any compilation errors, so options D and E are incorrect. There is a problem with this code snippet, though. While it may seem complicated,
    // the key is to notice that the variable r is updated outside of the do/while loop. This is alowed from a compilation standpoint, since it is defined before the loop, but it means the
    // innermost loop never rbeaks the termination condition r <=1. At runtime, this wil produce an infinite loop the first time the innermost loop is entered, making option F the correct answer.
    //27: A (-A, F) Line 27 does not compile because the case block does not yield a value if name is not equal to Frog. For this reason, option F is corret. Every path within a case block msut
    // yield a value if the switch expression is expected to return a value.
    //28: B (-B, F) Based on flow scoping, guppy is in scope after lines 41-42 fi the type is not a String. In this case, line 43 declaes a variable gupy that is a duplicate of the previously
    // defined local variable defined on line 41. For this reason, the code does not compile, and option F is correct. If a different variable name was used on line 43, then the code would
    // compile and print Swim! at runtime with the specified input.
    //29: C
}

class Test {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        var tailFeathers = 3;
        final var one = 1;
        switch (tailFeathers) {
            case one:
                System.out.print(3 + "");
            default:
            case 3:
                System.out.print(5 + "");
        }
        while (tailFeathers > 1) {
            System.out.print(--tailFeathers + "");
        }

    }
}
