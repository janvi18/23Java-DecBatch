import java.util.*;

public class fibo {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of terms: ");
    int n = sc.nextInt();
    int a = 0;
    int b = 1;
    int c = 0;
    System.out.println("The Fibonacci series is: ");
    for (int i = 1; i <= n; i++) {
      System.out.print(a + " ");
      c = a + b;
      a = b;
      b = c;
    }
    sc.close();
  }
}
