
    package fallk.logmaster;

import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LogTest442 {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        LogmasterSettings.c().outputToFile(false).apply();
        System.setOut(new PrintStream(new NullOutputStream()));
        System.setErr(new PrintStream(new NullOutputStream()));
    }

    @After
    public void tearDown() throws Exception {
    }
    
    //! $CHALK_START
    
    
    @Test
    public final void test_bright_white_Exception_long() {
        HLogger.bright_white(new Exception(), System.currentTimeMillis());
        HLogger.bright_white(new Exception(), System.nanoTime());
        HLogger.bright_white(new Exception(), Long.MAX_VALUE);
        HLogger.bright_white(new Exception(), Long.MIN_VALUE);
        HLogger.bright_white(new Exception(), 0);
        HLogger.bright_white((Exception) null, System.currentTimeMillis());
        HLogger.bright_white((Exception) null, System.nanoTime());
        HLogger.bright_white((Exception) null, Long.MAX_VALUE);
        HLogger.bright_white((Exception) null, Long.MIN_VALUE);
    }

    
    //! $CHALK_END
}
    