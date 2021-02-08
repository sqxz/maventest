package IoTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.InputStream;

public class ClassPathDemo {
    static final Logger LOGGER = LogManager.getLogger(ClassPathDemo.class);
    public InputStream inputStream;

    public void getFile(){
        inputStream = this.getClass().getResourceAsStream("/IoTest/test.xml");
    }

}
