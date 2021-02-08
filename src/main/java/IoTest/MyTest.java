package IoTest;

import java.io.IOException;

public class MyTest {


    public static void main(String[] args) throws IOException {
        ClassPathDemo classPathDemo = new ClassPathDemo();
        classPathDemo.getFile();
        System.out.println(classPathDemo.inputStream.read());;
    }
}
