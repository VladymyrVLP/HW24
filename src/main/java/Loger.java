
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Loger {
    private static final Logger loggerWarn = LoggerFactory.getLogger("logger.warn");
    private static final Logger loggerInfo = LoggerFactory.getLogger("logger.info");
    private static final Logger loggerError = LoggerFactory.getLogger("logger.error");


    public static void main(String[] args) {



        for (int i = 0; i < 100; i++){
            loggerInfo.info("example" + i);
           loggerWarn.warn("example" + i);
           loggerError.error("example" + i);
        }
    }
}
