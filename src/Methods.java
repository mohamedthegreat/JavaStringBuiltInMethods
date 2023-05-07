public class Methods {
    public static void main(String[] args) {


        System.out.println("-----------------------");
        System.out.println("--- charAt() method----");
        System.out.println("-----------------------");

        String name = "mohamed";
        System.out.println(name.codePointAt(0));
        //we can method chain and do something like this to make the first letter of the name uppercase.
        System.out.println(name.toUpperCase().charAt(0)); //method chaining
        System.out.println(name.substring(0,6).toUpperCase().charAt(1)); //this is called method chaining.

        for (int i = 0; i < name.length(); i++) {

            System.out.println("While loop and charAt(i): "+name.charAt(i));
        }
        System.out.println(name);

        System.out.println("The first letter of my name is: " + name.charAt(0)); //outputs: 'M'


        System.out.println("--------------------------------------------");
        System.out.println("---------- substring() ----------------------");
        System.out.println("----------------------------------------------");
        /* Substring(): slises a String from the beggining specified index to the last specified index.
        * Syntax: 'substring(startIndex, endIndex);'
        * Example: */
        String fullName = "Mohamed Ali";
        System.out.println("Full Name: " + fullName + ", before the substring method"); //Displays: Mohamed Ali

        String firstName = fullName.substring(0,7);
        System.out.println("First name is: " + firstName + ", after the substring method"); //dsplays: Mohamed

        String lastName = fullName.substring(8);
        System.out.println("Last name is: " + lastName + ", after the substring method"); //displays: Ali
        System.out.println("Using substring method with indexOf method");
        String name1 = "Tupac Shakur";
        String name2 = name1.substring(0,name1.indexOf(" "));
        System.out.println(name2); //displays: Tupac.
        System.out.println(name1.substring(name1.lastIndexOf(" ") +1));//Shakur.


        String hel = "Hello World";
        System.out.println(hel.substring(0,hel.indexOf(" "))); //displays: hello
        System.out.println(hel.substring(hel.indexOf(" ") +1)); //displays: World


        System.out.println("------------------------------------------------------------------");
        System.out.println("------------Contains() Method---------------------------------------");
        System.out.println("------------------------------------------------------------------");
        /* Returns true if a sequence of characters exists in a given string, otherwise false.
        * We can use this method to check if a sequence of lettres contain a specific or character
        * or a word.
        * Syntax: 'variblaName.contains("characterComparingtto);'
        * Example: */
        String letter = "I am sending letter to express my love for java";
        String legs = letter.contains("java") ? "It does contain it" : "Sorry nothing found";
        System.out.println(legs);

        String s1 = "world";
        String s2 = "World";
        System.out.println(s1.contains(s2)); // false because 'contains()' is caseSensetive

        String schoolName = "Rainier Beach High School";
        if (schoolName.toLowerCase().contains("high")) {
            System.out.println("it\'s \"High\", but we used \'toLowecase()\' to change it to \"high\", " +
                    "before comparing");
        } else {
            System.out.println("Sorry, we know contains is case sensative so we used mathod chaining");
        }

        String name6 = "Mohamed";
        String name7 = "Mohamed";
        String result1 = name6.contains(name7) ? "Gotta Match" : "Not equal";
        System.out.println(result1);

        String caseChanged = String.valueOf(name7.toLowerCase().contains(name6.toUpperCase()));
        System.out.printf("Are they the same: %s\n",caseChanged );

        System.out.println("--------------------------------------------------------");
        System.out.println("------------------codePointAt() Method-------------------");
        System.out.println("--------------------------------------------------------");
        /* Syntax: variableName.codePointAt(indexNumber);
        *The codePointAt() method returns the Unicode value of the character at the specified index in a string.
        * The index of the first character is 0, the second character is 1, and so on.
        *FYI: Here's the ASCII table --> https://www.asciitable.com/.
        * */
        String nname = "Mohamed";
        System.out.println(nname.codePointAt(0)); //outputs: 77,
        char c = 77; //77 is the ASCII number of Capital 'M'
        System.out.println(c); // outputs: 'M'

        System.out.println(nname.codePointAt(4) ); // outputs: 109
        char d = 109; // 109 is the ASCII number for lowercase 'm'
        System.out.println(d ); //outputs: 'm'

        char a = 7;
        System.out.println(a);


    max(100,205,199);
        System.out.println("\uD83D\uDD0A");

    }
    public static double max(double x, double y, double z) {
        System.out.println(Math.max(x,Math.max(y,z)));
        return Math.max(x,Math.max(y,z));
    }
}
