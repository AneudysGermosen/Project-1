// Created by Aneudys Germosen
// Last Update: 10/12/17
// Ap Computer Science Java
// Period 2


public class AGermosenLib {

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
