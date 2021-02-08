package IoTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class SerializableDemo {
    static final Logger LOGGER = LogManager.getLogger(SerializableDemo.class);

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(buffer);
        outputStream.writeInt(12);
        outputStream.writeUTF("name");
        outputStream.writeObject(Double.valueOf(123.44));
        LOGGER.info(Arrays.toString(buffer.toByteArray()));
    }
}
