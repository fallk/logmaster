
    package fallk.logmaster;

import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LogTest459 {

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
    public final void test_bright_grey_int_Exception_long_boolean() {
        HLogger.bright_grey(0, new Exception(), System.currentTimeMillis(), true);
        HLogger.bright_grey(0, new Exception(), System.currentTimeMillis(), false);
        HLogger.bright_grey(0, new Exception(), System.nanoTime(), true);
        HLogger.bright_grey(0, new Exception(), System.nanoTime(), false);
        HLogger.bright_grey(0, new Exception(), Long.MAX_VALUE, true);
        HLogger.bright_grey(0, new Exception(), Long.MAX_VALUE, false);
        HLogger.bright_grey(0, new Exception(), Long.MIN_VALUE, true);
        HLogger.bright_grey(0, new Exception(), Long.MIN_VALUE, false);
        HLogger.bright_grey(0, new Exception(), 0, true);
        HLogger.bright_grey(0, new Exception(), 0, false);
        HLogger.bright_grey(0, (Exception) null, System.currentTimeMillis(), true);
        HLogger.bright_grey(0, (Exception) null, System.currentTimeMillis(), false);
        HLogger.bright_grey(0, (Exception) null, System.nanoTime(), true);
        HLogger.bright_grey(0, (Exception) null, System.nanoTime(), false);
        HLogger.bright_grey(0, (Exception) null, Long.MAX_VALUE, true);
        HLogger.bright_grey(0, (Exception) null, Long.MAX_VALUE, false);
        HLogger.bright_grey(0, (Exception) null, Long.MIN_VALUE, true);
        HLogger.bright_grey(0, (Exception) null, Long.MIN_VALUE, false);
        HLogger.bright_grey(0, (Exception) null, 0, true);
        HLogger.bright_grey(0, (Exception) null, 0, false);
        HLogger.bright_grey(1, new Exception(), System.currentTimeMillis(), true);
        HLogger.bright_grey(1, new Exception(), System.currentTimeMillis(), false);
        HLogger.bright_grey(1, new Exception(), System.nanoTime(), true);
        HLogger.bright_grey(1, new Exception(), System.nanoTime(), false);
        HLogger.bright_grey(1, new Exception(), Long.MAX_VALUE, true);
        HLogger.bright_grey(1, new Exception(), Long.MAX_VALUE, false);
        HLogger.bright_grey(1, new Exception(), Long.MIN_VALUE, true);
        HLogger.bright_grey(1, new Exception(), Long.MIN_VALUE, false);
        HLogger.bright_grey(1, new Exception(), 0, true);
        HLogger.bright_grey(1, new Exception(), 0, false);
        HLogger.bright_grey(1, (Exception) null, System.currentTimeMillis(), true);
        HLogger.bright_grey(1, (Exception) null, System.currentTimeMillis(), false);
        HLogger.bright_grey(1, (Exception) null, System.nanoTime(), true);
        HLogger.bright_grey(1, (Exception) null, System.nanoTime(), false);
        HLogger.bright_grey(1, (Exception) null, Long.MAX_VALUE, true);
        HLogger.bright_grey(1, (Exception) null, Long.MAX_VALUE, false);
        HLogger.bright_grey(1, (Exception) null, Long.MIN_VALUE, true);
        HLogger.bright_grey(1, (Exception) null, Long.MIN_VALUE, false);
        HLogger.bright_grey(1, (Exception) null, 0, true);
        HLogger.bright_grey(1, (Exception) null, 0, false);
        HLogger.bright_grey(2, new Exception(), System.currentTimeMillis(), true);
        HLogger.bright_grey(2, new Exception(), System.currentTimeMillis(), false);
        HLogger.bright_grey(2, new Exception(), System.nanoTime(), true);
        HLogger.bright_grey(2, new Exception(), System.nanoTime(), false);
        HLogger.bright_grey(2, new Exception(), Long.MAX_VALUE, true);
        HLogger.bright_grey(2, new Exception(), Long.MAX_VALUE, false);
        HLogger.bright_grey(2, new Exception(), Long.MIN_VALUE, true);
        HLogger.bright_grey(2, new Exception(), Long.MIN_VALUE, false);
        HLogger.bright_grey(2, new Exception(), 0, true);
        HLogger.bright_grey(2, new Exception(), 0, false);
        HLogger.bright_grey(2, (Exception) null, System.currentTimeMillis(), true);
        HLogger.bright_grey(2, (Exception) null, System.currentTimeMillis(), false);
        HLogger.bright_grey(2, (Exception) null, System.nanoTime(), true);
        HLogger.bright_grey(2, (Exception) null, System.nanoTime(), false);
        HLogger.bright_grey(2, (Exception) null, Long.MAX_VALUE, true);
        HLogger.bright_grey(2, (Exception) null, Long.MAX_VALUE, false);
        HLogger.bright_grey(2, (Exception) null, Long.MIN_VALUE, true);
        HLogger.bright_grey(2, (Exception) null, Long.MIN_VALUE, false);
        HLogger.bright_grey(2, (Exception) null, 0, true);
        HLogger.bright_grey(2, (Exception) null, 0, false);
        HLogger.bright_grey(3, new Exception(), System.currentTimeMillis(), true);
        HLogger.bright_grey(3, new Exception(), System.currentTimeMillis(), false);
        HLogger.bright_grey(3, new Exception(), System.nanoTime(), true);
        HLogger.bright_grey(3, new Exception(), System.nanoTime(), false);
        HLogger.bright_grey(3, new Exception(), Long.MAX_VALUE, true);
        HLogger.bright_grey(3, new Exception(), Long.MAX_VALUE, false);
        HLogger.bright_grey(3, new Exception(), Long.MIN_VALUE, true);
        HLogger.bright_grey(3, new Exception(), Long.MIN_VALUE, false);
        HLogger.bright_grey(3, new Exception(), 0, true);
        HLogger.bright_grey(3, new Exception(), 0, false);
        HLogger.bright_grey(3, (Exception) null, System.currentTimeMillis(), true);
        HLogger.bright_grey(3, (Exception) null, System.currentTimeMillis(), false);
        HLogger.bright_grey(3, (Exception) null, System.nanoTime(), true);
        HLogger.bright_grey(3, (Exception) null, System.nanoTime(), false);
        HLogger.bright_grey(3, (Exception) null, Long.MAX_VALUE, true);
        HLogger.bright_grey(3, (Exception) null, Long.MAX_VALUE, false);
        HLogger.bright_grey(3, (Exception) null, Long.MIN_VALUE, true);
        HLogger.bright_grey(3, (Exception) null, Long.MIN_VALUE, false);
        HLogger.bright_grey(3, (Exception) null, 0, true);
        HLogger.bright_grey(3, (Exception) null, 0, false);
        HLogger.bright_grey(4, new Exception(), System.currentTimeMillis(), true);
        HLogger.bright_grey(4, new Exception(), System.currentTimeMillis(), false);
        HLogger.bright_grey(4, new Exception(), System.nanoTime(), true);
        HLogger.bright_grey(4, new Exception(), System.nanoTime(), false);
        HLogger.bright_grey(4, new Exception(), Long.MAX_VALUE, true);
        HLogger.bright_grey(4, new Exception(), Long.MAX_VALUE, false);
        HLogger.bright_grey(4, new Exception(), Long.MIN_VALUE, true);
        HLogger.bright_grey(4, new Exception(), Long.MIN_VALUE, false);
        HLogger.bright_grey(4, new Exception(), 0, true);
        HLogger.bright_grey(4, new Exception(), 0, false);
        HLogger.bright_grey(4, (Exception) null, System.currentTimeMillis(), true);
        HLogger.bright_grey(4, (Exception) null, System.currentTimeMillis(), false);
        HLogger.bright_grey(4, (Exception) null, System.nanoTime(), true);
        HLogger.bright_grey(4, (Exception) null, System.nanoTime(), false);
        HLogger.bright_grey(4, (Exception) null, Long.MAX_VALUE, true);
        HLogger.bright_grey(4, (Exception) null, Long.MAX_VALUE, false);
        HLogger.bright_grey(4, (Exception) null, Long.MIN_VALUE, true);
        HLogger.bright_grey(4, (Exception) null, Long.MIN_VALUE, false);
        HLogger.bright_grey(4, (Exception) null, 0, true);
    }

    
    //! $CHALK_END
}
    