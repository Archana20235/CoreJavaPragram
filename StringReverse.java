
class StringReverse
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String str = "Hello, World!";
        //System.out.print(str);

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            reversed += str.charAt(i);
        
	}
    System.out.println(reversed);
}
}