package MavenTestApp;
import org.slf4j.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
       Logger logger = LoggerFactory.getLogger(App.class);
       logger.info("hello world");
    }
}
