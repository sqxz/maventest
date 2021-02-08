package IoTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName FileDemo
 * @Description TDD
 * @Author shenzhenghuan
 * @Date 2020/3/21 17:17
 **/
public class FileDemo {
    static final Logger LOGGER = LogManager.getLogger(FileDemo.class);

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/IoTest/test1.xml");
        LOGGER.info(file.getName());
        LOGGER.info(File.separatorChar);
        LOGGER.info(file.getPath());
        LOGGER.info(file.getAbsolutePath());
        LOGGER.info(file.isFile());
        file.createNewFile();
//        file.delete();

        //创建临时文件，并在jvm退出时删除
        File file1 = File.createTempFile("tem-",".xml");
        file1.deleteOnExit();
        LOGGER.info(file1.getName());
        //tem-9128864082563924042.xml
        LOGGER.info(file1.getAbsolutePath());
        ///var/folders/8c/j0x8lnf12t5f3r07gp5q3mr00000gn/T/tem-9128864082563924042.xml

        File file2 = new File("src/main/resources/IoTest");
        File[] files = file2.listFiles();
        for (File file3 : files) {
            LOGGER.info(file3.getName());
        }
    }
}
