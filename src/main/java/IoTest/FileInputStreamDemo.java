package IoTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/*
public class FileInputStreamDemo {
    static final Logger LOGGER = LogManager.getLogger(FileInputStreamDemo.class);

    public static void main(String[] args) throws IOException {
       InputStream inputStream = new FileInputStream("src/main/resources/IoTest/test1.xml");
       inputStream.read();
=======*/
/**
 * @ClassName FileInputStreamDemo
 * @Description TDD
 * @Author shenzhenghuan
 * @Date 2021/1/29 17:49
 **/
public class FileInputStreamDemo {
    static final Logger LOGGER = LogManager.getLogger(FileInputStreamDemo.class);

    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("src/main/resources/log4j2.xml");
            inputStream.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
