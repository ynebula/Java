import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogFactoryTest {
    private static final Log logger = LogFactory.getLog(LogFactoryTest.class);

    public static void main(String[] args) {
        logger.debug("debug log");
        logger.info("info log");
        logger.warn("warn log");
        logger.error("error log");
        logger.fatal("fatal log");
    }
}