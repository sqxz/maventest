import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import redis.clients.jedis.Jedis;

import java.io.File;

/**
 * @ClassName JedisTest
 * @Description TDD
 * @Author shenzhenghuan
 * @Date 2020/3/18 19:10
 **/
public class JedisTest {
    final static Logger LOGGER = LogManager.getLogger(JedisTest.class);
    public static void main(String[] args){
        Jedis jedis = new Jedis("123.57.35.3",6379);
        jedis.auth("root");
        String ping = jedis.ping();
        LOGGER.info(ping);
        jedis.set("shopToken","this is shop_token");
        jedis.set("shopToken","this is brand_token");
        String shopToken = jedis.get("shopToken");
        LOGGER.info(shopToken);
    }
}
