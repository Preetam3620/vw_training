package miscellaneous;
import classImplementation.Employee;
public class StringBufferBuilderEx {
	public static void main(String[] args) {
		String s = "Preetam";
		System.out.println(s + " Maske");
		System.out.println(s);
		
		
	       //String imp conversions    

	       //char to String        
	       char ch = 'n';

	       String chstr = Character.toString(ch);
	       System.out.println("char ch="+ch+" to String:"+chstr);

	       //String to char

	       String yesno = "n";

	        ch =  yesno.charAt(0);
	        System.out.println("String "+yesno+" to char:"+ch);
	        System.out.println(ch);

	        //char to unicode value

	        ch = 'A';
	        Character x = ch;  //autoboxing char to Character


	        int charval = Character.getNumericValue(ch);

	        System.out.println("char ch="+ch+" to Unicode value:"+charval);



	       //important methods of string

	       String str = "Core Java Batch";

	       String str1 = str.substring(5,8);
	       System.out.println(str1);

	        str1 = str.substring(5);
	       System.out.println(str1);

	       System.out.println(str.toLowerCase());

	       //String to char array
	       char[] arr = str.toCharArray();



	}
}

