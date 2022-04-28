package Test;

// Java program to check whether a
// string is a Palindrome
// Using two pointing variables

// Main class
public class Test1 {

    // Method
    // Returning true if string is palindrome
    static boolean isPalindrome(String str)
    {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if ((str.charAt(i) != str.charAt(j)) && (str.charAt(i) != '?' && str.charAt(j) != '?') && !Character.isUpperCase(str.charAt(i) ) && !Character.isUpperCase(str.charAt(j) ))
                return false;

            if(str.charAt(i) == '?')
            {
                str = str.replace('?', str.charAt(j));
            }
            if(str.charAt(j) == '?')
            {
                str = str.replace('?', str.charAt(i));
            }
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        System.out.println(str);
        return true;
    }

    // Method 2
    // main driver method
    public static void main(String[] args)
    {
        // Input string
        String str = "?ab??a";

        //Convert the string to lowercase
        //str = str.toLowerCase();
        // passing bool function till holding true
        if (isPalindrome(str))

            // It is a palindrome
            System.out.print("Yes");
        else

            // Not a palindrome
            System.out.print("No");
    }
}
