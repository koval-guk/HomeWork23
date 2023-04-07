package test_runner;

import java.time.LocalDate;

public class TestResult {
    private int startedTestNum;
    private int successTestNum;
    private int failedTestNum;
    private LocalDate testStartDate;

    public int getStartedTestNum() {
        return startedTestNum;
    }

    public int getSuccessTestNum() {
        return successTestNum;
    }

    public int getFailedTestNum() {
        return failedTestNum;
    }


    public void setStartedTestNum(int startedTestNum) {
        this.startedTestNum = startedTestNum;
    }

    public void setSuccessTestNum(int successTestNum) {
        this.successTestNum = successTestNum;
    }

    public void setFailedTestNum(int failedTestNum) {
        this.failedTestNum = failedTestNum;
    }

    public void setTestStartDate(LocalDate testStartDate) {
        this.testStartDate = testStartDate;
    }

    @Override
    public String toString() {
        return "TestResult{" +
                "startedTestNum=" + startedTestNum +
                ", successTestNum=" + successTestNum +
                ", failedTestNum=" + failedTestNum +
                ", testStartDate=" + testStartDate +
                '}';
    }
}
