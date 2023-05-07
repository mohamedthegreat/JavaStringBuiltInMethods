package ComparingStringMethods;

public class StartsWith {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("----------- startsWith() method --------------");
        System.out.println("---------------------------------------------");

/*startsWith():
*
*
* Syntax
    boolean startsWith(String prefix).
* Example:
* result.startsWith("characters");
*--> returns a boolean 'true' or 'false'*/

        String str = "Hello, World";
        boolean result = str.startsWith("Hello");
        System.out.println(result);

        //to specify an index you want to begin the comparison at
        boolean result2 = str.startsWith("World", 7);
        System.out.println(result2);

        String language = "Write Once Run Anywhere";
        String result1 = language.startsWith("write") ? "yes it does" : "No it doesn't";
        System.out.println(result1);

        System.out.println(language.startsWith("Once",8));

        String str1 = "I love Java";
        boolean result3 = str1.startsWith("Java", 7);
        System.out.println("startWith used with a prefix argument  " + result3);


        trtheend("Mohamed");


    }
    public static void trtheend(String name) {
        if (name.startsWith("M") || name.startsWith("O") || name.startsWith("H")) {
            System.out.println("You're prepared and stay ready");
        } else if (name.startsWith("E") || name.startsWith("P")) {
            System.out.println("Genius geminis");
        }else {
            System.out.println("Normal as the usual");
        }

        String brosName = "Malick";
        boolean  name6 = brosName.startsWith("Mal", 0);
        System.out.println(name6);

        if (brosName.startsWith("M",0) || (brosName.startsWith("c",5))) {
            for (int i=0; i<=5; i++) {
                System.out.println(brosName.charAt(i));
            }
        }else{
            System.out.println(name6);
        }

        System.out.println("High school".startsWith("s",5));
    }



}
