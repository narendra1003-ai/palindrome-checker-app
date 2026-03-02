public class palindromecheckerapp {
    public static void main(String[] args) {
        String input = "racecar";

        palindromeService service = new palindromeService();
        boolean ispalindrome = service.checkpalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

class palindromeService {

    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}