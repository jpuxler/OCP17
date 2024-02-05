package BeyondClasses;

public class BookQuestions {

    // 1: A, B, C (-A): Iguana does not compile, as it declares a static field with the same name as an instance field. Records are implicitly final and cannot be marked abstract, which is why Gecko compiles and Chameleon does not, making option B
    // correct. Notice in Gecko that records are not required to declare any fields. BeardedDragon also compiles, as records may ovveride any accessor jmethods, making option D correct. Newt does not compile because records are immutable, so any
    // mutator methods that modify fields are not permitted. Overriding the equals() method is alloweod, though.
    // 2: A, B, E (D) The code compiles without issue, so option G is incorrect. The blank can be filled with any class or interface that is a supertype of TurtleFrog. Option A is the direct superclass of TurtleFrog, and option B is the same class,
    // so both are correct. BrazilianHornedFrog is not a superclass of TurtleFrog, so option C is incorrect.
    // TurtleFrog inherits the CanHop interface, so option D is correct. Option E is also correct, as var is permitted when the type is known. Finally, Long is an unrelated class that is not a superclass of TrutleFrog and is therefore incorrect.
    // 3: B (-B, C) When an enum contains only a list of values, the semicolon (;) after the list is optional. When an enum contains any other members, such as a constructor or variable, the semicolon is required. Since the enum list does not end with
    // a semicolon, the code does not compile, making option C the correct answer.
    // If the missing semicolon were added, the program would print 0 1 2 at runtime.
    // 4: B (-B, C) A class extending a sealed class must be marked final, sealed, or non-sealed. Since Armadillo is missing a modifier, the code does not compile and option C is correct.
    // 5: F (E, -F) First, the declarations of HasExoskeleton and Insect are correct and do not contain any errors, making options C and D incorrect. The concrete class Beetle extends Insect and inherits two abstract methods, getNumberOfSections() and
    // getNumberOfLegs(). The Beetle class includes an overloaded version of getNumberOfSections() that takes an int value. The method declaration is valid, making option F incorrect, although it does nto satisfy the abstract method requirement
    // inherited from HaasExoskeleton. For this reason, only one of the two abstract methods is properly overridden. The Beetle class therefore does not compile, and option E i correct.
    // 6: D (E) line 4 does nto compile, since an abstract method cannot include a body. Line 7 also does not compile because the wrong keyword is used. A class implements an interface; it does not extend it. For these reasons, options D and E are
    // correct.
    // 7: F (E, -F) The inherited interface method getNumOfGills(int) is implicitly public; therefore, it must be declared public in any concrete clas that implements the interface. Since the method uses the package (default) modifier in the ClownFish
    // class, line 6 does not compile,, making option E the correct answer. If the method
    // declaration were corect to include public on line 6, then the program would compile and print 15 at runtime, and option B would be the correct answer.
    // 8: ? (A, B, C) Instance variables msut include the private access modifier, making option D incorrect. While it is common for methods to be public, this is not required. Options A, B, and C fulfill this requirement.
    // 9: A, B, E (-B, F) The setSnake() method requires an instance of Snake. Cobra is a direct subclass, while GardenSnake is an indirect subclass. For these reasons, options A and E are correct. Option B is incorrect because Snake is abstract and
    // requires a concrete subclass for instantiation. Option C is incorrect because
    // Object is a supertype of Snake, not a subtype. Option D is incorrect as String is an unrelated class and does not inherit Snake. FInally, a null claue can always be passed as an object value, regardless of type, so option F is also correct.
    //10: B, D, E (A, C, -D) Walk declares a private method that is not inherited in any of its subtypes. For this reason, any valid class is supported on line X, making otpions A, B, and C correct. Line Z is more restrictive, with only ArrayList
    // or subtypes of ArrayList supported, makking option E correct.
    //11: C (B, -C) Starting with Java 16, inner classes can contain static variables, so the code compiles. Remember that private constructors can be used by any methods within the outer class. The butter reference on line 8 refers to the inner
    // class variable defined on line 6, with the output being 10 at runtime, and making option B correct.
    //12: ??? (A, B, E) Encapsulation allows using methods to get and set isntance variables so other classes are not directly using them, making options A and B correct. Instance variables must be private for this to work, making optin E correct
    // and option D incorrect. While there are common naming conventions, they are not required, making option C incorrect.
    //13: D (-D, F) When using an enum in a swith expression, the case statement must be made up of the enum values only. If the enum name is used in the case statement value, then the code does not compile. In this question, SPRING is acceptable,
    // but Seasons.SPRING is not. For this reason, the three case statements do not compile, making option F th ecorrect answer. If these three lines were corrected, then the code would compile and produce a NullPointerException at runtime.
    //14: B,C,E (A, -B) A sealed interface restricts which interfaces may extend it, or which classes may implement it, making options A and E correct. Option B is incorrect. For example, a non-sealed sublcass allows classes not lsited in
    // the permits clasue to indirectly extend the sealed class. Option C is corect. WHile a sealed class is commonly extended by a subclass marked final, ti can also be extended by a sealed or non-sealed subclass marked abstract. Option D is
    // incorrect, as the modifier is non-sealed, not nonsealed. Finally otpion F is incorrect, as sealed classes can contain nested subclasses.
    //15: B, C (-B, -C, G) Trick question - the code does not compile! For this reason, option G is correct. The Spirit class is marked final, so it cannot be extended. The main() method uses an anonymous class that inherits from SPirit,
    // which is not allowed. If Spirit were not marked final, the options C and F would be correct. Option A would print Booo!!!, while options B, D, and E would not ocmpile for various reasons.
    //16: E ?? The OstrichWrangler class is a static nested class; therefore, it cannot access the isntance member count. For this reason, line 5 does not compile, and option E is correct.
    //17:  A (-A, E, G) Lines 2 and 3 compile with interface variables implicitly public, static, and final. Line 4 also compiles, as static methods are implicity public. Line 5 does nto compile, making option E correct. Non-static itnerface
    // methods with a body must be explicitly marked private or default. Line 6 compiles, with the public modifier being added by the compiler. Line 7 does not ocmpile, as interfaces do not have protected members, making option G correct. Finally,
    // line 8 compiles without issue.
    //18: ??? (E) Diet is an inner class, which requires an instance of Deer to instantiate. Since the main() method is static, there is no such isntance. Therefore, the main() method does not compile, and option E is correct.
    // If a reference to Deer were used, such as calling new Deer().new Diet(), then the code would compile and print b at runtime.
    //19: G
    //20: B, F,
    //21: ???
    //22: C, D, F
    //23: F
    //24: B, D,
    //25: C, E,
    //26: ???
    //27: A, B,
    //28: B, D,
    //29: E
    //30: A, C, F
}
