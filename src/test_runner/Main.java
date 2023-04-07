package test_runner;

import math_library.SimpleMathLibraryTest;

public class Main {
    public static void main(String[] args) {
        TestRunner testRunner = new TestRunner("tests_log.txt");
        testRunner.runClass("math_library.SimpleMathLibraryTest");
        testRunner.runClass(SimpleMathLibraryTest.class);
        testRunner.runPackage("math_library");
    }
}
