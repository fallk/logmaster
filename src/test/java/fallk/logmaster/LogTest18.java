
    package fallk.logmaster;

import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LogTest18 {

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
    public final void test_error_String_long() {
        HLogger.error("Test string", System.currentTimeMillis());
        HLogger.error("Test string", System.nanoTime());
        HLogger.error("Test string", Long.MAX_VALUE);
        HLogger.error("Test string", Long.MIN_VALUE);
        HLogger.error("Test string", 0);
        HLogger.error((String) null, System.currentTimeMillis());
        HLogger.error((String) null, System.nanoTime());
        HLogger.error((String) null, Long.MAX_VALUE);
        HLogger.error((String) null, Long.MIN_VALUE);
    }

    
    //! $CHALK_END
}
    