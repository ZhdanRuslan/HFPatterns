package ch3_decorator.io_decorator;

import java.io.*;

public class LowerCaseInputStream extends FilterInputStream{

    LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase(c));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for(int i = off; i < off+result; i++){
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return result;
    }
}
