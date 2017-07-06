package ch3_decorator.io_decorator;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;

public class LowerCaseInputStream extends FileInputStream {

    public LowerCaseInputStream(FileDescriptor fdObj) {
        super(fdObj);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase(c));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for (int i = off; i < off + result; i++) {
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return result;
    }
}
