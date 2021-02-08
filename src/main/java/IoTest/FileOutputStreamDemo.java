package IoTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo {
    static final Logger LOGGER = LogManager.getLogger(FileOutputStreamDemo.class);

    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("src/main/resources/IoTest/test1.xml");
        outputStream.write("spring".getBytes("utf-8"));
        outputStream.flush();//
        outputStream.close();
    }
}
