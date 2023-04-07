package test_runner;

import org.junit.platform.console.ConsoleLauncher;

import java.io.*;

public class TestRunner {
    private final PrintStream so;

    public TestRunner(String saveLogsFileName) {
        OutputStream os = new File_System_OutputStream(saveLogsFileName);
        this.so = new PrintStream(os);
    }

    public void runClass(String className) {
        ConsoleLauncher.execute(so, so, "-c=" + className);
    }

    public void runClass(Class<?> clazz) {
        ConsoleLauncher.execute(so, so, "-c=" + clazz.getName());
    }

    public void runPackage(String packageName) {
        ConsoleLauncher.execute(so, so, "-p " + packageName);
    }
}
