package BeyondClasses;

public class BookQuestions {

    // 1: A, B, C (-A, -C, D): Iguana does not compile, as it declares a static field with the same name as an instance field. Records are implicitly final and cannot be marked abstract, which is why Gecko compiles and Chameleon does not, making option B
    // correct. Notice in Gecko that records are not required to declare any fields. BeardedDragon also compiles, as records may override any accessor methods, making option D correct. Newt does not compile because records are immutable, so any
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
    //20: B, F, (A, -B, D) Polymorphism is the property of an object to take on many forms. Part of polymorphism is that methods are replaced through overriding wherever they are called, regardless of whether they're in a parent or child class.
    // For this reason, option A is correct, and option E is incorrect. With hidden static methods, Java relies on the location and reference type to determine which method is called, making option B incorrect and option F correct. Finally,
    // making a method final, not  static, prevents it from being overridden, making option D correct and option C incorrect.
    //21: ??? (F) The record defines an overloaded constructor using parentheses, not a compact one. For this reason, the first line must be a call to another constructor, such as this(500, "Acme", LocalDate.now()). For this reason,
    // the code does not compile and option F is correct. If the parentheses were removed from the constructor to declare a compact constructor, then options A, C and E would be correct.
    //22: C, D, F (-F, G) Option C correctly creates an isntance of an inner class Cub using an instance of the outer class Lion. Options A, B, E and H use incorrect syntax for creating an instance of the Cub class.
    // Options D and G correctly create an instance of the static nested Den class, which does not require an instance of Lion, while option F uses invalid syntax.
    //23: F (D, -F) First, if an class or interface inherits two interfaces containing default methods with the same signature, it must override the method with its own implementation. The Penguin class does this correctly,
    // so option E is incorrect. The way to access an inherited default method is by using the syntax Swim.super.perform(), making option D correct. We agree that the syntax is bizarre, but you need to learn it.
    // Options A, B, and C are incorrect and result in compiler errors.
    //24: B, D, (-D, E) Line 3 does not compile because the static method hunt() cannot access an abstract instance method getName(), making option B correct. Line 6 does not compile because the private static
    // method sneak() cannot access the priavte instance method roar(), making option E correct. The rest of the lines compile without issue.
    //25: C, E, (B, -C, -E) Zebra.this.x is the correct way to refer to x in the Zebra class. Line 5 defines an abstract local class within a method, while line 11 defines a concrete anonymous class that extends the Stripes class.
    // The code compiles without issue and prints x is 24 at runtime, making option B the correct answer.
    //26: ??? (C, F) Enums are required to have a semicolon (;) after the list of values if there is anythin else in the enum. Don't worry; you won't be expected to track down missing semicolons on the whole exam - only on enum questions.
    // For this reason, line 5 should have a semicolon after it since it is the end of the lsit of enums, making option F correct. Enum constructors are implicitly private, making option C correct as well. The rest of the enum compiles without issue.
    //27: A, B, (-A, C, D, G) The compiler inserts an accessor for each field, a constructor containing all of the fields in the order they are declared, and useful implementations of equals(), hasCode(), and toString(),
    // making options B,C,D and G correct. Option A is incorrect, as the compiler would only insert a no-argument constructor if the record had no fields. Option E is incorrect, as records are immutable.
    // Option F is also incorrect and not a property of records.
    //28: B, D, (A) Camel does not compile because the travel() method does not declare a body, nor is it marked abstract, making option A correct. EatsGrass also does not compile because an interface method cannot be marked both
    // private and abstract, making option B correct. Finally, Eagle does not compile because it declares an abstract method soar() in a concrete class, making option D correct. The other classes compile without issue.
    //29: E (-E, F) The code does not compile, so options A through C are incorrect. Both lines 5 and 12 do not compile, as this(9 is used instead of this. Remember this() refers to calling a constructor, wherreas this is a reference to the
    // current isntance. Next, the compiler does not allow casting to an unrelated class type. Since Orangutan is not a subclass of Primate, the cast on line 15 is invalid, and the code does not compile. Due to these three lines containing
    // compilation errors, option F is the correct answer.
    //30: A, C, F (-A, E, -F) Bird and its nested Flamingo subclass compile without issue. The permits clause is optional if the subclass is nested or declared in the same file. For this reason, Monkey and its subclass Mandrill also compile
    // without issue. EmperorTamarin does not compile, as it is missing a non-sealed, sealed, or final modifier, making option C coccrect. Friendly also does not compile, since it list a subclas Silly that does not extend it, making option E correct.
    // While the permits clause is optional, the extends clause is not. Silly compiles jsut fine. Even though it does not extend Friendly, the compiler error is in the sealed class.
}
