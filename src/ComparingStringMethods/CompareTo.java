package ComparingStringMethods;



public class CompareTo {

    public static void main(String[] args) {

        System.out.println("-----------------------------------");
        System.out.println("------ compareTo() method ---------");
        System.out.println("-----------------------------------");

/*
-The .compareTo() method compares two strings lexicographically
  based on the Unicode value of each character in the string,
  if there's a match the method returns the value of '0', however
  if there isn't any match, the method subtracts the unicode values of
  both strings and returns the result of the subtraction.
-Example: 'A' has a unicode value of '65', and 'B' has a value of '66',
  if we compare 'A' to 'B' the method subtracts '65' from '66' and returns '-1'.
-compareTo() method is case-sensitive, 'A' has a unicode value of 65, and
  'a' has a unicode value of 97, comparing both of them returns value of 32.
compareTo() method Syntax:
stringA.compareTo(stringB); return type is 'integer'
-Both stringA and stringB are required in order for the
 compareTo() method to work properly.

A way to think about this lexicographical evaluation
is noting the Unicode values for the following character sets:
-----------------------------------------------------------------
Character Set	Range	         Example
1 - 9	      49 - 57	    "7".compareTo("3"); -> 55 - 51 = 4
A - Z	      65 - 90	    "A".compareTo("B"); -> 65 - 66 = -1
a - z	      97 - 122	    "z".compareTo("w"); -> 122 - 119 = 3
------------------------------------------------------------------
*/

        System.out.println("-- from 'A' to 'Z' alphabet unicode of '65' to '90' ----");
        for (char c=65; c<=90; c++){
            System.out.print(c +" "); //outputs: from 'A' to 'Z'
        }
        System.out.println("");

        System.out.println("--- from '65' to '90', the unicode of the letters 'A' to 'Z' -------");
        for (int i= 'A'; i<='Z'; i++) {
            System.out.print(i + ". "); //outputs: from '65' to '90'
        }
        System.out.println();

        System.out.println("--from 'a' to 'z', same as '97' to '122' ---");
        for (char c=97; c<=122; c++) {
            System.out.print(c + " "); //outputs: from 'a' to 'z'
        }
        System.out.println();

        System.out.println("--- from '97' to '122', same as 'a' to 'z' -------");
        for (int i='a'; i<='z'; i++) {
            System.out.print(i + "."); //outputs: from '97' to '122'
        }
        System.out.println();


        System.out.println("7".compareTo("3")); //output: is 4
        System.out.println("3".compareTo("7")); //-4

        System.out.println("----------------------------");
        System.out.println("--- Uppercase letters -----");
        System.out.println("----------------------------");
        //----- 'A' - 'Z'  or  65 - 90 ---------
        //These two statements below are comparing the same values
        System.out.println("A".compareTo("B")); // --> A(65) - B(66) = -1 | outputs: -1
        System.out.println("65".compareTo("66")); //--> 65(A) - 66(B)  = -1 | outputs: -1

        //To get a positive result, compare the bigger value number to smaller one
       //for positive result compare: 'Z' - 'A', negative result 'A' - 'Z'
        System.out.println("66".compareTo("65")); //output: 1
        System.out.println("B".compareTo("A")); //outputs: 1.
        //these two statements above are same. The unicode value of 'A' is '65'. and for 'B' is '66'.

        System.out.println("Mohamed".compareTo("mohamed")); // M(77) - m(109) = 32 | outputs: -32.
        System.out.println("mohamed".compareTo("Mohamed")); // --> m(109) - M(77) = 32 | outputs: 32


        System.out.println("M".compareTo("O"));//--> output: -2, they're 2 letters between 'M' and 'O' counting down.
        System.out.println("S".compareTo("Z")); //--> -7, they're 7 letters between 'S' and 'Z' counting down
        System.out.println("H".compareTo("C")); //--> H(72) - C(67) = 5; outputs: 5



        System.out.println("----------------------------");
        System.out.println("--- Lowercase Letters -----");
        System.out.println("----------------------------");
  /*        ---------- a - z	  or     97 - 122 -----
  * this next two statement pretty much the same and perform the operation.*/
        System.out.println("97".compareTo("98")); //--> 97(a) - 98(b) = -1 | outputs: -1
        System.out.println("a".compareTo("b")); //a(97) - b(98) = -1 | outputs: -1
        System.out.println("98".compareTo("97")); //--> 98'a' - 97'b' = 1 | outputs: 1
        System.out.println("b".compareTo("a")); //--> b(98) - a(97)  = 1 | outputs: 1

        System.out.println("m".compareTo("m")); //--> m(109) - m(109) = 0 | outputs: 0
        System.out.println("n".compareTo("c")); //-->
        System.out.println("C".compareTo("c")); //--> C(66) - c(99) = -32 | outputs: -32
        System.out.println("c".compareTo("C")); //--> c(99) - C(66) = 32 | outputs: 32

        System.out.println("Z".compareTo("z")); //--> Z(90) - 122) = -32 | outputs: -32

        System.out.println("--------------------------------------------------------");
        System.out.println("--------------Method chaining compareTo() ---------------");
        System.out.println("--- converting letters cases before comparing -----------");
        //If we're comparing 2 letters, and they're the same but 1 is uppercase and the other is a lowercase
        //We can constructor chain compareTo() with toLowercase() or toUpperCase() to ignore case-sensitivity.
        System.out.println("A".toLowerCase().compareTo("a".toLowerCase())); //output: 0

        String country = "USA";
        System.out.println(country.toLowerCase().compareTo("usa")); //--> U(117) - u(117) = 0 | outputs: 0
        //above we used toLowerCase() to convert 'U' to 'u' before comparing.

        System.out.println("------------------------------------------------");
        System.out.println("--- Math Operation on compareTo() results --------");
        System.out.println("--------------------------------------------------");

        int result = "m".compareTo("c"); //--> 109 - 99 = 10, assigned the 10 to the 'result' variable
        System.out.println(result); //--> outputs: 10
        result++; //we incremented result variable by 1;
        System.out.println(result); //outputs: 11
        result *=2; //--> multiplied the result(11) variable by 2.
        System.out.println(result); //--> outputs: 22

        System.out.println("C".compareTo("A") * 5); //--> (67 - 65) * 2 = 10; | outputs: 10

        System.out.println("c".compareTo("C") * 2); //--> (99 - 66) * 2 = 64 | outputs: 32
        System.out.println("H".compareTo("C") * 50); //--> (72 - 67) * 50 = 250; |  outputs: 250

        String lName = "Johnson";
        int times = (lName.compareTo("Alex") * 10);
        //expression above is same as: int times = (74 -65) * 10;

        System.out.println(times);
        System.out.println(lName.codePointAt(0)); //--> unicode of 'J' is 74
        System.out.println("Alex".codePointAt(0)); //--> unicode of 'A' is 65
    }
}
