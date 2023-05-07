package ComparingStringMethods;

public class RegionMatches {

    public static void main(String[] args) {

        System.out.println("---------------------------------------------");
        System.out.println("---------- regionMatches() method -----------");
        System.out.println("---------------------------------------------");


/*regoinMatches():
* The .regionMatches() method tests if two string
* regions are equal. It compares a substring in the
* given String to another substring in the argument passed.
*
*Syntax:
* string.regionMatches(ignoreCase, toffset, other, ooffset, len); returns boolean.
*
* Explaining regionMatches() parameters:
* 'ignoreCase': boolean value that indicates whether the comparison
*    should be case-sensitive('false') or case-insensitive('true').
* 'toffset': The starting index of the region  in the calling
*   string ('this' string) that will be compared to
* 'other': The other string that will be compared
*   to the calling string.
* 'oofset': The starting index of the region in the other string
*   that will be compared too.
* 'len': The number of characters to be compared in both
*   the calling string and the compared to string.
*
* Note: For the method to be case-sensitive, ignoreCase can also be omitted.
 */

        String S1 = new String("This is an example");
        String S2 = new String("is");
        System.out.print("Result of comparing S1 with S2: ");
        System.out.println(S1.regionMatches(true, 5, S2, 0, 2));


        String name = "MOhamed";
        String lName = "mohamed";
        System.out.println();
        int lenn = name.length() -1;
        boolean result =
                name.regionMatches(true,0,lName,0,lenn);
        System.out.println("Case-insensitive regionMatches result: " + result);
        boolean result1 =
                name.regionMatches(false,0,lName,0,lenn);
        System.out.println("Case-sensitive regionMatches result: " + result1);


        //comparing the first 4 characters.
        String language = "JavaScript";
        String language1 = "Java";
        boolean result3 =
                language.regionMatches(false,0,language1,0,3);
        System.out.println();
        System.out.println("Case-sensitive regionMatches result: " + result3);
        boolean result4 =
                language.regionMatches(false,0,language1,0,3);
        System.out.println("Case-insensitive regionMatches result: " + result4);


        int i = name.length();
        System.out.println();
        System.out.println(name.regionMatches(true,0,lName,0,i-1));

        String str2 = "Racecar";
        String str3 = "racecar";
        int len = str2.length() -1;
        if (str2.regionMatches(true,0,str3,0,len)){
            System.out.println("\'Racecar\' and \'racecar\' are same ignore cases");
        }else{
            System.out.println("\'Racecar\' and \'racecar\' aren't same with ignoring cases");
        }

        String a = "Omar";
        String b = "omar";
        System.out.println(a.regionMatches(false, 1,b,1,2));
        System.out.println("----------------------------------------------");
        for (int k=0; k<a.length(); k++) {
            System.out.println(a.regionMatches(true,0,b,0,3));
        }

        System.out.println("----");
       String str = "mohamed";
        String str1 = "medahom";
        System.out.println(str1.regionMatches(true, 0,str,4,2));

        String result2 =
        str1.regionMatches(true,0,str,4,3)? "Same " : "Not same";
        System.out.println(result2);
        //comparing str1 value from 0 to upto 2 character 'med',
        // to str from 4 and to more characters 'med'. if 'true' assign 'same'
        // to result variable, if 'false' assign 'not same' to result variable


        System.out.println("--- Omitting 'ignoreCase' -----");
//For the method to be case-sensitive, 'ignoreCase' parameter can also be omitted.
        System.out.println(str1.regionMatches( 0,str,4,2));

        String c1 = "USA";
        String c2 = "usa";
        System.out.println(c1.regionMatches(0,c2,0,2));

        if (c1.regionMatches(0,c2,0,2)) {
            System.out.println("They are the same");
        } else {
            System.out.println("String compared and not equal");
        }
        //They're not the same if we ignore case-sensitivity.

        String brosName = "Malick";
        String myName = "Mahamed";
        System.out.println(brosName.regionMatches(false, 0,myName,0,2));
    }
}
