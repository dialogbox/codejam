package org.dbox.code.codejam.r2017;

class TidyNumbers {

  static long solve(long N) {
    long cur = N;

    while (cur > 0) {
      char[] a = String.format("%d", cur).toCharArray();
      int p = findDecrease(a);
      if (p == -1) return cur;

      int l = a.length - p;

      long next = decrement(a, p);
      cur = next * (long)Math.pow(10, l);
      cur += (long)Math.pow(10, l) -1;
    }

    return -1;
  }

  private static long decrement(char[] a, int p) {
    long result = 0;
    for (int i = 0; i < p; i++) {
      if (i > 0) result *= 10;
      result += (a[i] - '0');
    }
    return result -1;
  }

  private static int findDecrease(char[] a) {
    char d = a[0];

    for (int i = 0; i < a.length; i++) {
      if (d > a[i]) return i;
      d = a[i];
    }

    return -1;
  }
}
