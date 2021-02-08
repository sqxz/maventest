package IoTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDemo {
    static final Logger LOGGER = LogManager.getLogger(FileInputStreamDemo.class);

    public static void main(String[] args) throws IOException {
       InputStream inputStream = new FileInputStream("src/main/resources/IoTest/test1.xml");
       inputStream.read();
    }
}
