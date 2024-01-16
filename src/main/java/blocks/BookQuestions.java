package blocks;

public class BookQuestions {

    // 1: D, E
    // 2: C, D, E
    // 3: A, E
    // 4: B, E, G
    // 5: A, D, F
    // 6: F
    // 7: C, E
    // 8: B, D, H    1/0 is not a compile error
    // 9: E
    //10: A, C, E, F,   C is incorrect because _ cannot be placed at the beginning or end of the literal
    //11: C     E  First two can removed because java.lang is auto imported. following two can be removed because in the same package
    //12: A, D, E, F, H  (A,C,D)    Line 4 doees not compile because Java does not support setting default method parameter values, making option C correct.line 7 does not compile because fins is in scope and accessible only inside the instance initializer on line 3, making D correct
    //13: A, B, C
    //14: A, B, D, E
    //15: C, E, F
    //16: A   (D)  \s means to keep whitespace.
    //17: D, F, G
    //18: B, C, F, G   (-G)  var is not a reserved word in Java
    //19: A, D
    //20: C,
    //21: D
    //22: C, F, G
    //23: A, D,




}

class KitchenSink {
    private int numForks;

    public static void main(String[] args) {
        int numKnives;
        System.out.println("""
                "# forks = " + numForks +
                 " # knives = " + numKnives + 
                # cups = 0""");
    }
}