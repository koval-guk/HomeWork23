package test_runner;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestParserMain {
    public static void main(String[] args) {
        TestResultParser testResultParser = new TestResultParser();
        System.out.print("by string : ");
        testResultParser.parse("tests_log.txt");
        File file = new File("tests_log.txt");
        System.out.print("by file : ");
        testResultParser.parse(file);
        Path path = Paths.get("tests_log.txt");
        System.out.print("by path : ");
        testResultParser.parse(path);
    }
}
