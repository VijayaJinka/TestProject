package PracticeProgramme;

public class Palindrome {
    public static void main(String[] args) {
        String originalStr = "madam";
        originalStr = originalStr.toLowerCase();
        boolean isPalindromecheck = true;
        for (int i = 0; i < originalStr.length() / 2; i++) {
            if (originalStr.charAt(i) != originalStr.charAt(originalStr.length() - 1 - i)) {
                boolean ispalindrome = false;
                break;
            }
            if (isPalindromecheck) {
                System.out.println(originalStr + " is a palindrome.");
            } else {
                System.out.println(originalStr + " is not a palindrome.");
            }

        }
    }
}
