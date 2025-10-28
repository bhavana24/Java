package first;

public class StringPalindrome {

	public static void main(String[] args) {

String s="madam", rev="";
for(int i=s.length()-1;i>=0;i--)
{
	rev=rev+s.charAt(i);
}

if(rev.equals(s))
{
	System.out.println("Palindrome String: "+rev);
}
	}

}
