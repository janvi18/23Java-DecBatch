package pattern;

public class revPyramid {

  public static void main(String[] args) {
    int i, j, k, rows = 8;
    for (i = 0; i <= rows - 1; i++) {
      for (j = 0; j <= i; j++) {
        System.out.print(" ");
      }
      for (k = 0; k <= rows - 1 - i; k++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }
  }
}
