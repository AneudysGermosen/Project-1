// Created by Sajarin Dider
// Last Update: 10/12/17
// Ap Computer Science Java
// Period 2

public class methodMadness {

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

      int sum = (n * (n + 1)) / 2;
        System.out.println(sum);
      return sum;

    }

    public static String vigCypher(String plaintext, String key) {

      String cyphertext = "";
      final int shift = 'A'; // 65

      for (int i = 0; i < plaintext.length(); i++) {
            int m = plaintext.charAt(i) - shift;
            int k = key.charAt(i % key.length()) - shift;
            int e = (m + k) % 26;
            char s = (char) (e + shift);
            cyphertext += s;
      }

      System.out.println(cyphertext);
      return cyphertext;
    }


// Created by Aneudys Germosen
// Last Update: 10/12/17
// Ap Computer Science Java
// Period 2

    public static void dateStr(String month, String day, String year) {
        String dash = "-";

        System.out.print(day); // i use this particular print statement to get the desired format for this code
        System.out.print(dash);
        System.out.print(month);
        System.out.print(dash);
        System.out.print(year);
    }

    public static boolean isPalindrome(String word) {

        int L= word.length();
        String reverse =""; // here i make an empty string where i will spell the input word backwards

        for(int x= L-1;x>=0;x--) {
            reverse = reverse + word.charAt(x);} // this for loop spells out the word backwards letter by letter each time it loops

        if(reverse.equals(word)) { // when the for loop is finished the string reverse should be equal to the word that was inputed
            System.out.println("this word is a palindrome");
            return true;}

        System.out.println("this word is not a palindrome");
        return false;


    }
    public static void quadraticSolver(int a, int b, int c) {
        double discriminant = (b*b)-(4*a*c); // here i define the discriminant
        double root = 0;
        double root2 = 0;

        if(discriminant < 0)
            System.out.println("answer is as real as big foot"); // if the discriminant is less then 0 the answer is imaginary hence the print out statement

        else
            root = ((-b)-Math.sqrt(discriminant))/(2*a); // here i print out both roots of the quadratic
        System.out.println(root);
        root2 = ((-b)+Math.sqrt(discriminant))/(2*a);
        System.out.println(root2);


    }
}
