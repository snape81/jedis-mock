package com.github.fppt.jedismock;

import com.github.fppt.jedismock.datastructures.Slice;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Created by Xiaolu on 2015/4/20.
 */
public class TestUtils {

    @Test
    public void testCloseQuietly() {
        Utils.closeQuietly(null);
        Utils.closeQuietly(new InputStream() {
            @Override
            public int read() {
                return 0;
            }

            @Override
            public void close() throws IOException {
                throw new IOException();
            }
        });
    }

}
