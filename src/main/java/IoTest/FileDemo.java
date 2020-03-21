package IoTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

/**
 * @ClassName FileDemo
 * @Description TDD
 * @Author shenzhenghuan
 * @Date 2020/3/21 17:17
 **/
public class FileDemo {
    static final Logger LOGGER = LogManager.getLogger(FileDemo.class);

    public static void main(String[] args){
        File file = new File("src/main/resources/log4j2.xml");
        LOGGER.info(file.getName());
        LOGGER.info(File.separatorChar);
        LOGGER.info(file.getPath());
        LOGGER.info(file.getAbsolutePath());
        LOGGER.info(file.isFile());
    }
}
