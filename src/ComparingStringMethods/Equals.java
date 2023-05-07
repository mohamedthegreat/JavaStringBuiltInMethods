package ComparingStringMethods;

public class Equals {
    public static void main(String[] args) {
/* .equals()
-The .equals() method returns 'true' if two strings are equal in value.
Otherwise, false is returned.
-he equals() method is case-sensitive, meaning that the string "HELLO"
 is considered to be different from the string "hello".
Syntax:
boolean result = string1.equals(string2); return type is boolean 'true' or 'false'
string.equals(object);
-The object comparison can either be String literal or a representation of a string value,
 This will return 'true' if the String has the same character sequence as the 'object'.
Example: */
        System.out.println("----------- Comparing two String literals --------------");

        // 1: Using .equals() comparison With string literals
        System.out.println("two".equals("two")); //outputs: 'true' - 'two' and 'two' are the same value.

        System.out.println("Welcome".equals("Welcome")); //outputs: 'true' - 'Welcome' and 'Welcome' are the same value.
        if ("Welcome".equals("welcome")) {
            System.out.println("\'Welcome\' and \'welcome\' are the same value");
        } else {
            System.out.println("\'Welcome\' and \'welcome\' are not the same value");
        }

        System.out.println("Hello".equals("hello")); //outputs: 'false' - 'Hello' and 'hello' aren't the same value.

        System.out.println("Programing".equals("programing")); //outputs: 'false' - case-sensitivity makes it 'false'.
        //below using ternary operator to assign a value based on the outcome of the string literal comparison.
        String occupation = "Programing".equals("programing") ? "We are the same value" : "We are not the same value";
        System.out.println(occupation);

        //FYI: Remember the .equals() is case-sensitive, meaning 'One' and 'one' are not the same string literals.


        System.out.println("------ Representation of String value ----------");
        //2: Using .equals() comparison with a representation of a string value
        String language = "Java";
        String language1 = "java";
        System.out.println(language.equals(language1)); //outputs: false 'Java' and 'java' aren't the same.


        String fName = "Mohamed";
        String lName = "mohamed";
        System.out.println(fName.equals(lName)); //outputs: false. 'Mohamed' and 'mohamed' aren't the same.

        String str = "SpringBoot";
        String str1 = "springBoot";
        System.out.println(str.equals(str1));//outputs: 'false';

        String udemy = "Course";
        String Udemy = "Course";
        System.out.println(udemy.equals(Udemy)); //outputs: 'true'

        //Using ternary operator to assign value based on the result of the comparison.
        String same = udemy.equals(Udemy) ? "They are the same" : "They are not the same";
        System.out.println("Is \'Course\' the same as \'Course\' ?: " + same);


        System.out.println("-- Changing the case-sensitivity before comparing ------");
    /* since the .equals() method is case-sensitive, we can actually either
    * transform both values we are comparing between into a lowercase
    * or uppercase and compare them together,
    * Example:*/
        String firstName = "Ali";
        String lastName = "ali";
        System.out.println(firstName.toLowerCase().equals(lastName.toLowerCase())); //outputs: true.
        //above we transformed both String values to lowercase then compared them to each other.


        //we can also do the opposite by transforming them to uppercase before comparing them to each other.
        System.out.println(firstName.toUpperCase().equals(lastName.toUpperCase())); //outputs true;

        //using ternary operator along with .equals and toLowercase to assign a value based on the outcome



    }
}
