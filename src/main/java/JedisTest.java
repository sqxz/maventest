import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import redis.clients.jedis.Jedis;

/**
 * @ClassName JedisTest
 * @Description TDD
 * @Author shenzhenghuan
 * @Date 2020/3/18 19:10
 **/
public class JedisTest {
    final static Logger LOGGER = LogManager.getLogger(JedisTest.class);
    public static void main(String[] args){
        Jedis jedis = new Jedis("127.0.0.1",6379);
        String ping = jedis.ping();
        LOGGER.info(ping);
        jedis.set("shopToken","this is shop_token");
        String shopToken = jedis.get("shopToken");
        LOGGER.info(shopToken);
    }
}
