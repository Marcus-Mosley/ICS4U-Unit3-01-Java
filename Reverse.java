import java.util.Scanner;

/**
* The Reverse program implements an application that
* outputs the reverse of an inputted string.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-05-20
*/
public class Reverse {
  /**
  * The ReverseStr method uses recursion to return the reversed string.
  */
  public static String reverseStr(String str) {
    if (str.isEmpty()) {
      return str;
    } else { 
      return reverseStr(str.substring(1)) + str.charAt(0);
    }
  }

  /**
  * The Main method receives input.
  */
  public static void main(String[] args) {
    String str;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    str = input.nextLine();
    
    System.out.println('\n' + reverseStr(str) + " is the reversed string");
  }
}
