import java.util.*;

public class palindromeNum {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    int rev = 0;
    int temp = num;
    while (temp != 0) {
      int rem = temp % 10;
      rev = rev * 10 + rem;
      temp = temp / 10;
    }
    if (num == rev) {
      System.out.println("The number is a palindrome.");
    } else {
      System.out.println("The number is not a palindrome.");
    }
    sc.close();
  }
}
