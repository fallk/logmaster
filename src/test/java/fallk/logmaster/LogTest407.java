
    package fallk.logmaster;

import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LogTest407 {

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
    public final void test_bright_magenta_int_Exception() {
        HLogger.bright_magenta(0, new Exception());
        HLogger.bright_magenta(0, (Exception) null);
        HLogger.bright_magenta(1, new Exception());
        HLogger.bright_magenta(1, (Exception) null);
        HLogger.bright_magenta(2, new Exception());
        HLogger.bright_magenta(2, (Exception) null);
        HLogger.bright_magenta(3, new Exception());
        HLogger.bright_magenta(3, (Exception) null);
        HLogger.bright_magenta(4, new Exception());
    }

    
    //! $CHALK_END
}
    