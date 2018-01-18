
import java.util.Scanner;

public class ssn {

    public static void main(String[] args){
        Scanner SSN = new Scanner(System.in);
        String s = null;
        boolean valid = false;

        System.out.println("Enter a Social Security Number");

        while (valid == false){
          try{
            s = SSN.nextLine();
            valid = true;
          } catch(Exception e){
            System.out.println("No input! Enter a Social Security Number");
          }
        }

        String result = (validSSN(s) ? " is a valid SSN" : " is not a SSN");
        System.out.println(s + result);

    }

    public static boolean validSSN(String str){
      //check length first
      if (str.length() != 11) return false;

      //traverse through each character
      for (int i = 0; i < str.length(); i++){
        if (i <= 2){
          //these must be digits, otherwise return false
          if (!isDigit(str.charAt(i))){
            return false;
          }
        }
        else if (i == 3 || i == 6){
          //these must be dashes, otherwise return false
          if (!isDash(str.charAt(i))){
            return false; 
          }
        }
        else if (i > 6){
          //these must be digits, otherwise return false
          if (!isDigit(str.charAt(i))){
            return false;
          }
        }
      }

      //return true if it didn't error out
      return true;
    }

    public static boolean isDigit(char c){
      return Character.isDigit(c);
    }

    public static boolean isDash(char c){
      return (c == '-');
    }

}