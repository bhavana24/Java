package first;

public class StringReverse {

	public static void main(String[] args) {
		
		//by using charAt

String s="Welcome", rev="";
/*for(int i=s.length()-1;i>=0;i--)
{
	rev=rev+s.charAt(i);
}
System.out.println(rev);
	
	*/
	
	//by using charArray

	/*
	 * char s1[]=s.toCharArray();
	 * 
	 * for(int i=s1.length-1;i>=0;i--) { rev=rev+s1[i]; } System.out.println(rev);
	 */

//by using String buffer and builder
StringBuffer sb=new StringBuffer("Ram");
System.out.println(sb.reverse());

}
}
