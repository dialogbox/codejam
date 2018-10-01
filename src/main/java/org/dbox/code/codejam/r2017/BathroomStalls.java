package org.dbox.code.codejam.r2017;

import java.util.Arrays;
import java.util.List;

class BathroomStalls {
    static List<Long> solve(long N, long K) {
        long max = N;
        long nMax = 1;
        long min = N-1;
        long nMin = 0;

        long cap = 1;
        long k = K;

        long nextMax;
        long nextMin;
        long nextNMax;
        long nextNMin;

        while (cap < k) {
            k -= cap;
            cap *= 2;

            if (isEven(max)) {
                nextMax = max/2;
                nextMin = nextMax -1;

                nextNMax = nMax;
                nextNMin = nMax + (2 * nMin);
            } else {
                nextMax = (max-1)/2;
                nextMin = nextMax -1;

                nextNMax = (2 * nMax) + nMin;
                nextNMin = nMin;
            }

            max = nextMax;
            min = nextMin;
            nMax = nextNMax;
            nMin = nextNMin;
        }

        long targetStall;
        if (k <= nMax) {
            targetStall = max;
        } else {
            targetStall = min;
        }

        if (isEven(targetStall)) {
            return Arrays.asList(targetStall/2, targetStall/2 -1);
        } else {
            return Arrays.asList((targetStall-1)/2, (targetStall-1)/2);
        }
    }

    static boolean isEven(long n) {
        return n % 2 == 0;
    }
}
