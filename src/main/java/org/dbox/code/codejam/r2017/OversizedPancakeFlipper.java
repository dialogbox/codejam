package org.dbox.code.codejam.r2017;

class OversizedPancakeFlipper {

  static int solve(String s, int k) {
    int result = 0;
    int cur = 0;
    char[] a = s.toCharArray();
    int len = a.length;

    while(true) {
      if (cur > (len - k)) {
        if (checkRest(a, cur)) {
          return result;
        } else {
          return -1;
        }
      }

      if (a[cur] == '+') {
        cur++;
        continue;
      }

      flip(a, cur, k);
      result++;
      cur++;
    }
  }

  private static void flip(char[] a, int cur, int k) {
    for (int i = cur; i < cur + k; i++) {
      if (a[i] == '+') {
        a[i] = '-';
      } else {
        a[i] = '+';
      }
    }
  }

  private static boolean checkRest(char[] a, int cur) {
    for (int i = cur; i < a.length; i++) {
      if (a[i] != '+') return false;
    }
    return true;
  }
}
