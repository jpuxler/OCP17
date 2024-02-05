package methods;

public class BookQuestions {


    // 1: E (A) Instance and static variables can be marked final, making option A correct.
    // 2: B, C
    // 3: A, D
    // 4: A, B, C ? (E) The value 6 can be implicitly promoted to any of the primitive types, making options A, C, and E correct.
    // It can also be autoboxed to Integer, making option B correct. It cannot be both promoted and autoboxed, making options D and F
    // incorrect.
    // 5: A, C, D
    // 6: A, B, E, F (-E) Options A and B are correct because the single varargs parameter is the last parameter declared.
    // Option F is correct because it doesn't use any varargs parameters. Option C is incorrect because the varargs parameter is not
    // last. Option D is incorrect because two varargs parameters are not allowed in the same method. Option E is incorrect because
    // the ... for a varargs must be after the type, not before it.
    // 7: D, E, F (-E) Option D passes the initial parameter plus two more to turn into a varargs array of size 2. Option F passes the
    // initial parameter plus an array of size 2. Option A does not compile because it does not pass the initial parameter.
    // Option E does not compile because it does not declare an array properly. It should be new boolean[] {true, true}. Option B
    // creates a varargs array of size 0, and option C creates a varargs array of size 1.
    // 8: A, C, D (-A, -C) Option D is correct. A common pratice is to set all fields to be private and all methods to be public.
    // Option A is incorrect because protected access allows everything that package access allows and additionally allows subclasses
    // access. Option B is incorrect because the class is public. This means that other classes can see the class. However, they
    // cannot call any of the methods or read any of the fields. It is essentially a useless class. Option C is incorrect because
    // package access applies to the whole package. Option E is incorrect because Java has no such wildcard access capability.
    // 9: B, C, D, F
    //10: C, F (B, -C, -F) Rope runs line 3, setting LENGTH to 5, and then immediately after that runs the static initializer,
    // which sets it to 10. Line 5 in the Chimp class calls the static method normally and prints swing and a space. Line 6 also
    // calls the static method. Java allows calling a static method through an instance variable, although it is not recommended.
    // Line 7 uses the static import on line 2 to reference LENGTH. For these reasons, option B is correct.
    //11: C, F (B -C E -F) Line 10 does not compile because static methods are not allowed to call instance methods. Even though we
    // are calling play() as if it were an instance method and an instance ecists, Java knows play() is really a static method and
    // treats it as such. Since this is the only line that does not compile, option B is correct. If line 10 is removed, the code
    // prints swing-swing, making option E correct. It does not throw a NullPointerException on line 17 because play() is a static
    // method. Java looks at the type of the reference for rope2 and translates the call to Rope.play()
    //12: B
    //13: C (-C D) There are two details to notice in this code. First, note that RopeSwing has an isntance initializer and not a
    // static initializer. Since RopeSwing is never constructed, the instance initializer does not run. The other deatils is taht
    // length is static. Changes from any object update this common static variable. The code prints 8, making option D correct.
    //14: E ? If a variable is static final, it must be set exavtly once, and it must be in the declaration line or in a static
    // initialization block. Line 4 doesn't compile because bench is not set in either of theses locations. Line 15 doesn't compile
    // because final variables are not allowed to be set after that point. Line 11 doesn't compile because name is set twice: once
    // in the declaration and again in the static block. Line 12 doesn't compile because rightRope is set twice as well. Both are in
    // static initialization blocks. Since four lines do not compile, option E is ocrrect.
    //15: B,
    //16: C (-C, E) The argument on line 17 is a short. It can be promoted to an int, so print() on line 5 is invoked. The argument
    // on line 18 is a boolean. It can be autoboxed to a Boolean, so print() on line 11 is invoked. The argument on line 19 is a double.
    // It can be autoboxed to a Double, so print() on line 11 is invoked. Therefore, the output is int-Object-Object-, and the correct
    // answer is option E.
    //17: E (B, -E) Since Java is pass-by-value and the variable on line 8 never gets reassigned, it stays as 9. In the method square,
    // x starts as 9. The y value becomes 81, and then x gets set to -1. Line 9 does set result to 81. However, we are printing out
    // value, and that is still 9, making option B corect.
    //18: B, D, E
    //19: B, C, E
    //20: A (E) The 100 parameter is an int and so calls the matching int method, making option A correct. When this method is
    // removed, Java looks for the next most specific constructor. Java prefers autoboxing to varargs, so it chooses the Integer
    // constructor. The 100L parameter is a long. Since it can't be converted into a smaller type, it is autoboxed into a Long and
    // then the method for Object is called, making option E correct.
    //21: D (B) Option A is incorrect because it has the same parameter list ot types and therefore the same signature as the original
    // method. Options B and D are valid method overloads because the types of parameters in the list change. When overloading methods,
    // the return type and access modifiers do not need to be the same. Option sC and E are incorrect because the method name is
    // different. Options F and G do not compile. There can be at most one varargs parameter, and it must be the last elemetn in the
    // parameter list.

}

class Test {

    public static void main(String[] args) {
        double t = 6;
        test();
    }

    private static void test() {
        var string = "12345";
        System.out.println(string.length());
    }


}



