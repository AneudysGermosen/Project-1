
wc class IsPalindrome {
	public static void main (String[]args){ isPalindrome("anna");}

public static boolean isPalindrome(String word ) {
	
	int L=word.length(); //sdnied
	String last = "";
	String first = word.substring(0, (L/2));
	
	for(int x=1;x<=L/2;x++) {
		last = last + word.charAt(L-x);}
		{if(last!=first) {
			System.out.println("no");
			return false;}
		else {
	System.out.println("yes");
	return true;}
	
}
	}

}