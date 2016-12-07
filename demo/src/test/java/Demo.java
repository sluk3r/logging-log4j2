import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by wangxichun on 2016/12/7.
 */
public class Demo {

    @Test
    public void main() {
        Logger logger = LogManager.getLogger();

        logger.info("hello");
    }

}
