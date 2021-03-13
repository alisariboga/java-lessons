package day06nestedifternaryswitch;

import java.util.Scanner;

public class StringManipulation01 {
  /*  String Methods:
            1)toUpperCase() 2)toLowerCase() 3)charAt()      4)equals()            5)equalsIgnoreCase()    6)length()
	 	7)next()        8)nextLine()    9)indexOf()     10)lastIndexOf()	  11)contains() 12)startsWith()
	 */

    public static void main(String[] args) {

        String str = "Java is easy if you study";

//        //9)indexOf() returns the index of first occurence of the character
//        System.out.println(str.indexOf("i"));//5
//        //indexOf() accepts char as parameter as well
//        System.out.println(str.indexOf('i'));//5
//        //If the character does not exist in the String, it returns "-1"
//        System.out.println(str.indexOf("x"));//-1
//        //If you use multiple characters in indexOf(), it returns the index of first character
//        System.out.println(str.indexOf("easy"));//8
//        //If you use indexOf() with 2 parameters, Java looks for the character after the given index.
//        //Second parameter is inclusive
//        System.out.println(str.indexOf('e', 8));//13

		/*
		 Ask user to enter a String and a character, then check if the String has the character	or not
		*/
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a String the enter a character");
//		String s = scan.nextLine();
//		char ch = scan.next().charAt(0);
//
//		String result = s.indexOf(ch)==-1 ? "The String has no the character" : "The String has the character";
//		System.out.println(result);

        //10)lastIndexOf() returns the index of last occurence of the character
        String t = "Java ah Java!";

//        //In lastIndexOf() method you can use char and String. Both are acceptable
//        System.out.println(t.lastIndexOf('a'));//11
//        System.out.println(t.lastIndexOf("a"));//11
//        //lastIndexOf() method returns -1, if the character does not exist in the String
//        System.out.println(t.lastIndexOf("w"));//-1
//        //lastIndexOf() returns the index of first character of last occurence of "Java"
//        System.out.println(t.lastIndexOf("Java"));//8
//        //If you use lastIndexOf() with 2 parameters, get the character starting with the index and to the begining of the String
//        //In the following example we are usen "Java a"
//        System.out.println(t.lastIndexOf("v", 5));

		/*
		 	Ask user to give you a String and a character.
		 	If the character does not exist in the String or exists just once, print "Not good!"
		 	If the character is used multiple times print "Wooow!".
		*/
//		System.out.println("Enter a String the enter a character");
//		String s = scan.nextLine();
//		char ch = scan.next().charAt(0);
//
//	    if(s.indexOf(ch)==-1 || s.indexOf(ch)==s.lastIndexOf(ch)) {
//	    	System.out.println("Not good!");
//	    }
//	    if(s.indexOf(ch) != s.lastIndexOf(ch)) {
//	    	System.out.println("Wooow!");
//	    }

        //11)contains()	is used to check if a single character or multiple characters exist in a String
        // contains() method returns boolean
        // contains() method cannot be used with chars, you have to use Strings
//        String r = "Learn coding by typing";
//        System.out.println(r.contains("e"));//true
//        System.out.println(r.contains("x"));//false
//        System.out.println(r.contains("earn"));//true
//
        //12 startsWith() is used for to check if this String starts with the specific prefix
        //startsWith() can be used with only String. We can't use it with char.
        //startsWith() can be used with more than one characters
        //startsWith() returns boolean

        String r = "Learn coding by typing";
//
//        System.out.println(r.startsWith("L"));//True
//        System.out.println(r.startsWith("I"));//false
//        System.out.println(r.startsWith("Le"));//true
//        System.out.println(r.startsWith("c", 6));//TRUE
//        System.out.println(r.startsWith("by", 13));//true
//        System.out.println(r.startsWith("typ", 13));//false


        //endsWith()
        //13 startsWith() is used for to check if this String starts with the specific prefix
        //startsWith() can be used with only String. We can't use it with char.
        //startsWith() can be used with more than one characters
        //startsWith() returns boolean
        System.out.println(r.endsWith("g"));//true
        System.out.println(r.endsWith("n"));//false
        System.out.println(r.endsWith("ping"));//true

        //14) isEmpty() returns boolean, true means the lenght of the String is equal to 0
        System.out.println(r.isEmpty());//false
        String s = "";
        System.out.println(s.isEmpty());// true

        //15) replace()
        //to replace all occurrences of a specific character I can use replace()
        String str2 = "Java is easy";

        System.out.println(str2.replace("a", "e"));//jeve is eesy
        System.out.println(str2);//java is easy
        System.out.println(str2.replace("a", "?????"));//j?????v????? is e?????sy
        System.out.println(str2.replace("a", str));

        //How can i delete all "a" ?
        System.out.println(str2.replace("a", ""));//jv is esy
        //How can I put ! before and after each character?
        System.out.println(str2.replace("", "!"));//!J!a!v!a! !i!s! !e!a!s!y!
        System.out.println(str2.replace('a', 'e'));//Jeve is eesy

        //16) replaceAll()
        // replaceAll() and replace() does the same thing
        // But there are some differences : 1) In replaceAll() you cannot use chars
        //  2) In replaceAll() you can use regular expressions


        String str3 = "Teach_more, learn123 more!!! ..";
        /*Regular Expressions ==>
        1) \\s: space character
        2) \\S: all characters except space character
        3) \\w: All characters except a->z A->Z   _ 0->9
        4) \\W All characters except a->z A->Z  _ 0->9
        5) \\d 0 -> 9
        6) \\D All characters except 0->9
         */

        //\\s: space character :
        System.out.println(str3.replaceAll("\\s", "*"));// Teach_more,*learn123*more!!!**..
        //\\S: all characters except space character
        System.out.println(str3.replaceAll("\\S", "*"));// *********** ******** *******  **
        //\\w: a->z  A->Z _    0->9
        System.out.println(str3.replaceAll("\\w", "&"));// &&&&&&&&&&, &&&&&&&& &&&&!!!  ..
        //\\W: All characters except a->z    A->Z _    0->9
        System.out.println(str3.replaceAll("\\W", "%"));// Teach_more%%learn123%more%%%%%%%
        //\\d: 0 -> 9
        System.out.println(str3.replaceAll("\\d", "+"));// Teach_more, learn+++ more!!!  ..
        //\\D: All characters except 0 -> 9
        System.out.println(str3.replaceAll("\\D", "*"));// *****************123************


        //17) replaceFirst()
        // replaceFirst() changes just the first occurrance of the character
        System.out.println(str3.replaceFirst("a", "e")); //Teech_more, learn123 more!!!  ..


    }
}
