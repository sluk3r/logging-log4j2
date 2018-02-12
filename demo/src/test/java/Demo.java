import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by wangxichun on 2016/12/7.
 */
public class Demo {

    @Test
    public void main() throws InterruptedException {
        Logger logger = LogManager.getLogger();

        while (true) {
            logger.info("hello");

            logger.debug("debug info");

            TimeUnit.SECONDS.sleep(5);
        }


    }

}
