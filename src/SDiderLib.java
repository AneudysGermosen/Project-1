// Created by Sajarin Dider
// Last Update: 10/12/17
// Ap Computer Science Java
// Period 2


public class SDiderLib {

    public static void main(String[] args) {
    }

    public static boolean IsFibonnaci(int check) {

    int first = 0;
    int second = 1; //Setting up the three terms for the fibonacci sequence
    int third =0;

        while (third < check) {
            third = first + second; // This generates all of the numbers of the fibonacci sequence up to int check
            first = second;
            second = third;
    }
        if(third == check){ //  if the third number is equal to our check integer then we know our number is in the fibonacci sequence
            System.out.println(true);
            return true;}
        else{
            System.out.println(false);
            return false;}
    }

    public static int sumUpTo(int n) {

      int sum = (n * (n + 1)) / 2; // This is the formula to find the sum of a series.
        System.out.println(sum);
      return sum;

    }

    public static String vigCypher(String plaintext, String key) {

        String cyphertext = ""; // We set up an empty string, which will be our output.
        plaintext = plaintext.toUpperCase(); // Having our plaintext and key both uppercase make the encryption easier to manage

        for (int i = 0, j = 0; i < plaintext.length(); i++) {
            char a = plaintext.charAt(i);
            if (a < 'A' || a > 'Z') continue;    // Here we go through each character of our plaintext
            cyphertext += (char)((a + key.charAt(j) - 2 * 'A') % 26 + 'A'); // Here we are converting each character of the plaintext using the ascii values
            j = ++j % key.length();
        }
        System.out.println(cyphertext);
        return cyphertext;

    }
}
