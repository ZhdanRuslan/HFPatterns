package ch3_decorator.io_decorator;

import java.io.*;

public class InputTest {

    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("E://test.txt")));

        while ((c = in.read()) >= 0){
            System.out.print((char) c);
        }

        in.close();
    }
}
