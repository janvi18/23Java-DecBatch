import java.util.*;

public class armstrong {

  public static void main(String args[]) {
    int n;
    int sum = 0;
    int temp;
    int remainder;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer to check if it is an armstrong number");
    n = sc.nextInt();
    temp = n;
    while (temp != 0) {
      remainder = temp % 10;
      sum = sum + remainder * remainder * remainder;
      temp = temp / 10;
    }
    if (n == sum) {
      System.out.println(n + " is an armstrong number.");
    } else {
      System.out.println(n + " is not an armstrong number.");
    }
  }
}
