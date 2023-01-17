
package student;

import java.util.Scanner;

/**
 *
 * @author Altyn
 */
public class ReverseWord {
   public static void main(String[] args){
       /*char[] myArray = new char[7];
       myArray[0]= 's';
       myArray[1]= 't';
       myArray[2]= 'u';
       myArray[3]= 'd';
       myArray[4]= 'e';
       myArray[5]= 'n';
       myArray[6]= 't';
       
       for(int i=0; i<myArray.length ;i++){
           System.out.println(myArray[i]);
       }*/
       System.out.println("Enter a word.");
       Scanner scn = new Scanner(System.in);
       String word = scn.nextLine();
       
       char[] myLetter = new char[word.length()];
       
       for(int i=0; i<myLetter.length;i++){
           myLetter[i]= word.charAt(i);
           System.out.println(myLetter[i]);
       }
       
       for(int i= myLetter.length-1; i>=0; i--){
           myLetter[i] =word.charAt(i);
           System.out.println(myLetter[i]);
       }
    
       
   }//end of main class
    
}//end of class
