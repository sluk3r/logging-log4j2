import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
//import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;


/**
 * Created by wangxichun on 2016/12/7.
 */
public class Demo {

    @Test
    public void log4jDemo() throws InterruptedException {
        Logger logger = LogManager.getLogger();

        logger.info("hello");

        logger.debug("debug info");

        TimeUnit.SECONDS.sleep(5);
    }

//    @Test
//    public void test_slf4j() {
//        org.slf4j.Logger logger = LoggerFactory.getLogger(Demo.class); //wxc 2018-2-13:10:43:56 默认情况下,slf4j并没有使用Log4j的实现, 而是自己的org.slf4j.impl.SimpleLogger实现类.
//
//        assertTrue(logger.getClass().getSimpleName().equals("SLF4JLogger"));
//
//        logger.info("This is an information message");
//        logger.error("this is a error message");
//        logger.warn("this is a warning message");
//    }

}
