public class ABC {
  public static void main(String[] args) {
    int a[] = { 10, 20, 30, 21 };
    int n = a.length,j;
    for (int i = 0; i < n; i++) {
      // System.out.print(a[i]);
      if (a[i] % 2 == 0) {
        for (j = i + 1; j < n; j++) {
          a[i] = a[j];
          // System.out.print(a[i]);
        }
        i--;
        n--;

        j--;
        // System.out.print(n);
      }
    }
    for (j = 0; j < 7; j++) {
      System.out.println(a[j] + " ");
    }
  }
}
