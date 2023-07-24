package utils.retrofit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class test {

    private static Logger logger = LoggerFactory.getLogger(test.class);

    public static void main(String[] args) {
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");

        String variable = "Hello John";
        logger.debug("Printing variable value {} ", variable);
    }
}
