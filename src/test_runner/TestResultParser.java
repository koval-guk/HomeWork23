package test_runner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestResultParser {
    public TestResult testResult;

    public void parse(String fileName) {
        doParse(fileName);
    }

    public void parse(File file) {
        doParse(file.getName());
    }

    public void parse(Path path) {
        doParse(String.valueOf(path.getFileName()));
    }

    public void doParse(String fileName) {
        testResult = new TestResult();
        try (FileReader fr = new FileReader(fileName);
             Scanner scanner = new Scanner(fr)) {
            Pattern started = Pattern.compile("tests started");
            Pattern success = Pattern.compile("tests successful");
            Pattern failed = Pattern.compile("tests failed");
            LocalDate date;
            String tempString;
            String[] splitStrings;
            String regex = "[\\[\\]a-z ]+";
            while (scanner.hasNextLine()) {
                tempString = scanner.nextLine();
                try {
                    date = LocalDate.parse(tempString);
                    testResult.setTestStartDate(date);
                } catch (Exception ignored) {   //may i do this?
                }
                Matcher matcherStarted = started.matcher(tempString);
                Matcher matcherSuccess = success.matcher(tempString);
                Matcher matcherFailed = failed.matcher(tempString);
                if (matcherStarted.find()) {
                    splitStrings = tempString.split(regex);
                    testResult.setStartedTestNum(testResult.getStartedTestNum() + Integer.parseInt(splitStrings[1]));
                } else if (matcherSuccess.find()) {
                    splitStrings = tempString.split(regex);
                    testResult.setSuccessTestNum(testResult.getSuccessTestNum() + Integer.parseInt(splitStrings[1]));
                } else if (matcherFailed.find()) {
                    splitStrings = tempString.split(regex);
                    testResult.setFailedTestNum(testResult.getFailedTestNum() + Integer.parseInt(splitStrings[1]));
                }
            }
            System.out.println(testResult.toString());
        } catch (FileNotFoundException e) {
            System.out.println("File not found ! " + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
