/*program to convert an int variable to String using
  an inbuilt function of String class.*/

package session7_assignment1;
import java.util.Scanner;
public class IntToString {

	public static void main(String[] args) {
		/*scanner class object is used to take an integer form user*/
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the integer that you wish to convert to a String: ");
        int inputInteger = s.nextInt();
	
		System.out.println("vaiable in integer :"+inputInteger);
		
		 //converting the integer to string 
		String str = Integer.toString(inputInteger);
		
		//printing value converted to String 
		System.out.println("This variable in String is :"+str);
		s.close();

	}

}