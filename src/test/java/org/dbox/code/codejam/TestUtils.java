package org.dbox.code.codejam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestUtils {
  public static BufferedReader getInput(String problemId, String caseId) throws IOException {
    return Files.newBufferedReader(Paths.get("src/test/resources", problemId, String.format("%s.in.txt", caseId)), StandardCharsets.UTF_8);
  }

  public static BufferedWriter getOutput(String problemId, String caseId) throws IOException {
    return Files.newBufferedWriter(Paths.get("src/test/resources", problemId, String.format("%s.out.txt", caseId)), StandardCharsets.UTF_8);
  }
}
