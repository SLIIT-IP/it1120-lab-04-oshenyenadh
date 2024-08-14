import java.util.Scanner;

public class IT24101268Lab4Q1
{
 public static void main(String [] args)
  {
    
   //Create a Scanner object called value
     Scanner value = new Scanner(System.in);

   //Prompet the user to enter the number
     System.out.print("enter the number: ");

   //Read the number from the keyboard
     double number = scanner.nextdouble();
 
   //check if the number positive,negative or zero
     if (number > 0){
         System.out.println("The number is Positive.");

     } else if (number < 0){
         System.out.println("The number is Negative.");

     }else {
         System.out.println("The number is Zero.");
     }

    //Close the sacnner
      scanner.close();
  
   }
}