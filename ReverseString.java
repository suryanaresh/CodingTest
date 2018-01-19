public class ReverseString {
	public static void main(String args[])
	{
       String original = "abcdef", reverse = "";
       int length = original.length();

        for ( int i = length - 1 ; i >= 0 ; i-- ){
	    reverse = reverse + original.charAt(i);
        }
                                
        System.out.println("Reverse of string is: "+reverse);
	}
}