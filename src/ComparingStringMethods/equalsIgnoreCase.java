package ComparingStringMethods;

public class equalsIgnoreCase {
    public static void main(String[] args) {
/*
*-The .equalsIgnoreCase() method compares two strings ignoring lower/upper
*  case differences and returns true if the two are the same. Otherwise, it returns false.
* -The only way equalsIgnoreCase() returns 'false' is only if the values being compared
*  are completely different values.
* FYI: 'Welcome' and 'welcome' are the same values as it ignores the case-sensitivity.
*  Syntax
boolean result = stringOne.equalsIgnoreCase(stringTwo); return type is boolean 'true' or 'false'
* string.equalsIgnoreCase(object);
* -The object comparison can either be String literal or a representation of a string value,
 This will return 'true' if the String has the same character sequence as the 'object'.
* Example:*/

        System.out.println("------------------------------------------------------------");
        //instead of comparing string literals ignoring their case-sensitivity like below:
        boolean result0 = "java".toLowerCase().equals("JAva".toLowerCase());
        System.out.println(result0);

        //we can instead comparing compare two string literals ignoring the case-sensitivity like below:
        boolean result = "java".equalsIgnoreCase("JAva");
        System.out.println(result);

        System.out.println("-- Using ternary operator to compare using equalsIgnoreCase()" +
                " and assign a value to a string variable below --");
        //instead of writing like this:
        String result1 = "Hello".toLowerCase().equals("hello".toLowerCase()) ? "Same or equals" :
                "Not the same or equals";
        System.out.println("\'Hello\' and \'hello\': " + result1);
        //above output: 'Same or equals'

        //we can instead use 'equalsIgnoreCase()' method like this below:
        String result2 = "Hello".equalsIgnoreCase("hello") ? "They're the same " :
                "No they're not the same value";
        System.out.println("\'Hello\' and \'hello\': " + result2);
        //above output: 'They're the same' - it ignores case-sensitivity.

        System.out.println("Welcome".equalsIgnoreCase("Wlcome"));


        System.out.println("-----Using equalsIgnoreCase() with Representation of a String value ------------");
        String language1 = "Java";
        String language2 = "Javascript";
        System.out.println(language1.equalsIgnoreCase(language2));

        String greet = "Hello World";
        String Greet = "hello world";
        if (greet.equalsIgnoreCase(Greet)) {
            System.out.println("Both string values are the same"); //output: is this string literal.
        } else {
            System.out.println("Both string values are not the same");
        }

        String language = "Java";
        String languege = "Java";
        System.out.println(language.toUpperCase().equalsIgnoreCase(languege));
        //above output: true.
        String same = language.toUpperCase().equalsIgnoreCase(language) ? "Same value" : "different value";
        System.out.println("are \'JAVA\' and \'Java\' the same using equalsIgnoreCase() method ?: " + same);
        //above output: 'Same value'

        boolean same1 = language.toUpperCase().equalsIgnoreCase(languege.toLowerCase()) ? true : false;
        System.out.println("are \'JAVA\' and \'java\' the same using equalsIgnoreCase() method ?: " + same1);
        //above output: 'true'

    }
}
