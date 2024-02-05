package coreApi;

public class BookQuestions {

    // 1: F
    // 2: C, E, F
    // 3: A, C, D
    // 4: A, C, D, E (-E) The code compiles fine. Line  3 points to the String in the string pool. Line 4 calls the String constructor explicitly and is therefore a different object than s.
    // Line 5 checks for object equality, which is true, and so it prints one. Line 6 uses object reference eequality, which is not true since we have different objects. Line 7 calls intern(),
    // which returns the value from the string pool and is therefore the same reference as s. Line 8 also compares references but is true since both references point to the object from the
    // string pool. Finally, line 9 is a trick. The string Hello is already in the string pool, so calling intern() does not change anything. The reference t is a different object, so the
    // result is still false.
    // 5: B
    // 6: C ? Remember to watch return types on math operations. One of the tricks is line 24. The round() method returns an int when called with a float. However, we are calling it with a
    // double, so it returns a long. The other trick is line 25. The random() method returns a double. Since two lines have a compiler error, option C is the answer.
    // 7: A, D (-D, E) When dealing with time zones, it is best to convert to GMT first by subtracting the time zone. Remember that subtracting a negative is like adding.
    // The first date / time is 9:00 GMT, and the second is 15:00 GMT. Therefore the first one is earlier by six hours.
    // 8: A, B, E, F (-E) Option E is incorrect. It does not compile because the parentheses for the legnth() method are missing.
    // 9: A, C, E (-E, F) Arrays are zero-indexed, making option A correct and option B incorrect. They are note able to change size, which is option C. The values can be changed
    // making option D incorrect. An array does not override equals(), so it uses object equality. Since two different objects are not equal, option F is correct, and options E and G are incorrect.
    //10: A
    //11: E
    //12: B, D, E (A, -B) First, notice that the indent() call adds a blank space to the beginning of numbers, and stripLeading() immediately removes it. Therefore, theses methods cancel each other
    // out and have no effect. The substring() method has two forms. The first takes the index to start with and the index to stop immediately before. The second takes just the indext to start
    // with and goes to the end of the String. Remember that indexes are zero-based. The first call starts at index 1 and ends with index 2 since it needs to stop before index 3. This gives us
    // Option A. The second calls starts at index 7 and ends in the same place, resulting in an empty String which is Option E. This prints out a blank line. The final call starts at index 7
    // and goes to the end of the String finishing up with option D.
    //13: B
    //14: A, F ? Option A correctly creates the current instant. Option F is also a proper conversion. Option B is incorrect because Instant, like many other date/time classes, does not have a
    // public constructor and is instantiagted via methods. Options C, D, and E are incorrect because the source object does not represent a point in time. WIthout a time zone, Java doesn't
    // know what moment in time to use for the Instant.
    //15: C, E ? Numbers sort before letters and uppercase sorts before lowercase. This makes option C one of the answers. The binarySearch() method looks at where a value would be inserted,
    // which is before the second element for Pippa. It then negates it and subtracts one, which is Option E.
    //16: A, B, G, ??? Warum G und nicht F However, the method also normalizes by adding a new line to the end if it is missing. The extra character means we add five characters to the
    // exisiting 11, which is option G.
    //17: A, G
    //18: C, F
    //19: A, B, D,
    //20: B, D, (A, -B) The dateTime1 object has a time of 1:30 per initialization. The dateTime2 object is an hour later. However, there is no 2:30 when springing ahead, setting the time
    // to 3:30. Option A is correct because it is an hour later. Option D is also correct because the hour of the new time is 3. Option E is not correct becuase we have changed the time
    // zone offset due to daylight saving time.
    //21: C, (A) The reverse/( method is the easiest way of reversing the characters in a StringBuilder, therefore, option A is correct.
    //22: E (A, -E) The date starts out as April 30, 2022. Since dates are immutable and the plus methods return values are ignored, the result is unchanged. Therefore, option A is correct.
}

class Test {
    public static void main(String[] args) {

        test();
    }

    private static void test() {
        var string = "12345";
        System.out.println(string.length());
    }

}