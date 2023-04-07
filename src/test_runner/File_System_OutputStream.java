package test_runner;

import java.io.*;
import java.time.LocalDate;

public class File_System_OutputStream extends OutputStream implements Closeable, Flushable {
    OutputStream fos;
    OutputStream cos;

    public File_System_OutputStream(String fileName) {
        try {
            fos = new FileOutputStream(fileName, true);
            cos = new PrintStream(System.out);
            fos.write(LocalDate.now().toString().getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("File" + fileName + " not found !");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void write(int b) throws IOException {
        fos.write(b);
        cos.write(b);
    }

}
