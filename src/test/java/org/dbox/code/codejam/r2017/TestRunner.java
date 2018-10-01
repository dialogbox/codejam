package org.dbox.code.codejam.r2017;


import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import org.dbox.code.codejam.TestUtils;
import org.junit.jupiter.api.Test;

class TestRunner {
  static class OversizedPancakeFlipperTest {
    @Test
    void oversizedPancakeFlipper() throws IOException {
      oversizedPancakeFlipperCase("A-small-practice");
      oversizedPancakeFlipperCase("A-large-practice");
    }

    @Test
    void oversizedPancakeFlipperBase() {
      assertThat(OversizedPancakeFlipper.solve("---+-++-", 3), is(3));
      assertThat(OversizedPancakeFlipper.solve("+++++", 4), is(0));
      assertThat(OversizedPancakeFlipper.solve("-+-+-", 4), is(-1));
    }

    private void oversizedPancakeFlipperCase(String caseId) throws IOException {
      final String problemId = "r2017/OversizedPancakeFlipper";

      Scanner in = new Scanner(TestUtils.getInput(problemId, caseId));
      BufferedWriter w = TestUtils.getOutput(problemId, caseId);

      int numOfCase = in.nextInt();

      for (int i = 0; i < numOfCase; i++) {
        String s = in.next();
        int k = in.nextInt();

        int result = OversizedPancakeFlipper.solve(s, k);

        if (result >= 0) {
          w.write(String.format("Case #%d: %d\n", i+1, result));
        } else {
          w.write(String.format("Case #%d: IMPOSSIBLE\n", i+1));
        }
      }

      w.close();
      in.close();
    }
  }

  static class TidyNumbersTest {
    @Test
    void tidyNumbers() throws IOException {
      tidyNumbersCase("B-small-practice");
      tidyNumbersCase("B-large-practice");
    }

    @Test
    void tidyNumbersBase() {
      assertThat(TidyNumbers.solve(132L), is(129L));
      assertThat(TidyNumbers.solve(1000L), is(999L));
      assertThat(TidyNumbers.solve(7L), is(7L));
      assertThat(TidyNumbers.solve(111111111111111110L), is(99999999999999999L));
    }

    private void tidyNumbersCase(String caseId) throws IOException {
      final String problemId = "r2017/TidyNumbers";

      Scanner in = new Scanner(TestUtils.getInput(problemId, caseId));
      BufferedWriter w = TestUtils.getOutput(problemId, caseId);

      int numOfCase = in.nextInt();

      for (int i = 0; i < numOfCase; i++) {
        long k = in.nextLong();

        long result = TidyNumbers.solve(k);

        w.write(String.format("Case #%d: %d\n", i+1, result));
      }

      w.close();
      in.close();
    }
  }

  static class BathroomStallsTest {
    @Test
    void tidyNumbers() throws IOException {
      bathroomStallsCase("C-small-practice-1");
      bathroomStallsCase("C-small-practice-2");
      bathroomStallsCase("C-large-practice");
    }

    @Test
    void bathroomStallsBase() {
      assertThat(BathroomStalls.solve(4L, 2L), contains(1L, 0L));
      assertThat(BathroomStalls.solve(5L, 2L), contains(1L, 0L));
      assertThat(BathroomStalls.solve(6L, 2L), contains(1L, 1L));
    }

    private void bathroomStallsCase(String caseId) throws IOException {
      final String problemId = "r2017/BathroomStalls";

      Scanner in = new Scanner(TestUtils.getInput(problemId, caseId));
      BufferedWriter w = TestUtils.getOutput(problemId, caseId);

      int numOfCase = in.nextInt();

      for (int i = 0; i < numOfCase; i++) {
        long n = in.nextLong();
        long k = in.nextLong();

        List<Long> result = BathroomStalls.solve(n, k);

        w.write(String.format("Case #%d: %d %d\n", i+1, result.get(0), result.get(1)));
      }

      w.close();
      in.close();
    }
  }
}
