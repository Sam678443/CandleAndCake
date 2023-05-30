public class PalindromeChecker {
  public static String reverse(String palindrome) {

    StringBuilder reversed = new StringBuilder();
    reversed.append(palindrome);
    reversed.reverse();

    return reversed.toString();
  }

  public static int reverse(int palindrome) {
    String stringPalindrome = "" + palindrome;
    StringBuilder reversed = new StringBuilder();
    reversed.append(stringPalindrome);
    reversed.reverse();

    return Integer.parseInt(reversed.toString());
  }

  public static boolean checkPalindrome(String message) {
    String reversedMessage = reverse(message);

    if (message.equals(reversedMessage)) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean checkPalindrome(int message) {
    Integer reversedMessage = reverse(message);

    if (Integer.valueOf(message).equals(reversedMessage)) {
      return true;
    } else {
      return false;
    }
  }
}
