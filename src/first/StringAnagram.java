package first;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {

String s1="silent", s2="listen";
if(s1.length()==s2.length())
{
	char arr1[]=s1.toLowerCase().toCharArray();
	char arr2[]=s2.toLowerCase().toCharArray();
	
	
	Arrays.sort(arr1); 

	 Arrays.sort(arr2);
		
	
	
	
	if(Arrays.equals(arr1, arr2))
	{
		System.out.println(s1+" "+s2+" "+"are anagrams");
	
}
	else
	{
		System.out.println(s1+" "+s2+" "+"are not anagrams");
	}
}

else {
	System.out.println(s1+" "+s2+" "+"are not equal length");
}

	}

}
