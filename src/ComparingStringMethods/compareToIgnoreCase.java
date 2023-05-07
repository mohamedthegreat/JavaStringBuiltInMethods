package ComparingStringMethods;

public class compareToIgnoreCase {
    public static void main(String[] args) {

        System.out.println("-----------------------------------------");
        System.out.println("----- compareToIgnoreCase() method --------");
        System.out.println("-----------------------------------------");

/*
* compareToIgnoreCase():
* Compares Strings lexicographically based on the
* unicode value of each character while ignoring the
* case. Returns '0' if the strings are equals.
* the return value is negative if the current
* string is less than the string parameter.
* The return value is greater than '0' if the
* current string is greater than the string parameter
* Syntax:
* stringA.compareToIgnoreCase(stringB);
*
* Through the CASE_INSENSITIVE_ORDER field of
* the String class, upper and lower case characters
* effectively hold the same Unicode value (e.g., “a” - “A” = 0).
* compareToIgnoreCase(): turns all letters into a lowercase letters
* */
        String word = "Udemy";
        String word1 = "udemy";
        System.out.println(word.compareToIgnoreCase(word1)); //outputs: 0, ignoring the case sensitivity they're equal.


        System.out.println("-----------------------------------------");
        System.out.println("--- Using compareToIgnoreCase with string literal ---");
        System.out.println("-----------------------------------------");

     //instead of method chaining writing like we did below:
     System.out.println("mohamed".toUpperCase().compareTo("Mohamed".toUpperCase())); // --> 0
     //we can instead use like compareToIgnoreCase() this using.
     System.out.println("mohamed".compareToIgnoreCase("Mohamed")); // --> 0

        System.out.println("A".compareToIgnoreCase("B")); //--> a(97) - b(98) = -1.

        System.out.println("USA".compareToIgnoreCase("usa")); //--> 0
        System.out.println("usa".compareToIgnoreCase("USA")); //--> 0

        System.out.println("Worldcup".compareToIgnoreCase("Basketball")); //--> -21
        System.out.println("Basketball".compareToIgnoreCase("Worldcup")); //--> -21

        System.out.println("Lakers".compareToIgnoreCase("Warriors")); //--> -11
        System.out.println("Warriors".compareToIgnoreCase("Lakers")); //--> 11

        System.out.println("Ronaldo".compareToIgnoreCase("Messi")); //--> 5
        System.out.println("Messi".compareToIgnoreCase("Ronaldo")); //--> -5



        System.out.println("-----------------------------------------");
        System.out.println("--- compareToIgnoreCase() with representation of string value ---");
        System.out.println("-----------------------------------------");

        String a = "Jordan";
        String b = "Lebron";
        System.out.println(a.compareToIgnoreCase(b)); //--> -2

        String str1 = "Mom";
        String str2 = "dad";
        /*We can use the 'codePointAt() method
        to find the unicode value of a character
        at a specific index.
         */
        System.out.println(str1.codePointAt(0));

        System.out.println(str1.compareToIgnoreCase(str2)); //--> 9
        System.out.println(str2.compareToIgnoreCase(str1)); //--> -9


        System.out.println("---------------");
        String lName= "ABCDE";
        for (int i=0; i<lName.length(); i++) {
            System.out.println(lName.compareToIgnoreCase("EDCBA"));
        }

    }
}
