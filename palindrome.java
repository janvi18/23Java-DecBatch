public class palindrome {

  public static void main(String args[]) {
    String s = "madam";
    String rev = "";
    int len = s.length();
    for (int i = len - 1; i >= 0; i--) {
      rev = rev + s.charAt(i);
    }
    if (s.equals(rev)) {
      System.out.println("The string is a palindrome.");
    } else {
      System.out.println("The string is not a palindrome.");
    }
  }
}
