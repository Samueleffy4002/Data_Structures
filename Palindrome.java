public class Palindrome {

    public static void main(String[] args) {
        String word = "radar";
        boolean isPalindrome = checkPalindrome(word);

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String word) {
        char[] charArray = word.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


}



