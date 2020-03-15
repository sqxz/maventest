import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.Properties;

public class ReadProperties {

    final static Logger logger = LogManager.getLogger(ReadProperties.class);


    /**
     * 创建Properties实例；
     * 调用load()读取文件；
     * 调用getProperty()获取配置。
     * @param fileName
     * @param key
     * @return
     * @throws IOException
     */
    public String getHost(String fileName,String key) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(fileName));
        return properties.getProperty(key);
    }

    public void setHost(String fileName,String key,String value) throws IOException {
        Properties properties = new Properties();
        properties.setProperty(key,value);
        OutputStream outputStream = new FileOutputStream(fileName);
    }

    public static void main(String[] args) throws IOException {
        ReadProperties read = new ReadProperties();
        String preHost = read.getHost("src/main/resources/environment.properties","pre");
        logger.info(preHost);
    }
}
